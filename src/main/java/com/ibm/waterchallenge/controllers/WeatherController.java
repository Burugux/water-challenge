package com.ibm.waterchallenge.controllers;

import com.ibm.waterchallenge.models.Sites;
import com.ibm.waterchallenge.models.SitesDetails;
import com.ibm.waterchallenge.models.Summary;
import com.ibm.waterchallenge.models.WeatherData;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

@RestController
@RequestMapping("/v1/weather")
public class WeatherController {
    private static final Logger logger = getLogger(WeatherController.class);

    private @Value("${darkSky.url}")
    String darkSkyBaseUrl;

    private @Value("${darkSky.key}")
    String darkSkyKey;

    @GetMapping("/")
    @ApiOperation(value = "List all weather conditions", notes = "Get weather conditions at all sites")
    public Summary getAllWeather(@RequestParam(required = false, defaultValue = "1") int offset,
                                 @RequestParam(required = false, defaultValue = "10") int limit) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://waterpoint-engine-challenge-dev.mybluemix.net/sensors/sites/summary";
        Summary summary = restTemplate.getForObject(url, Summary.class);

        assert summary != null;
        List<Sites> sites = getPage(summary.getData().getSites(), offset, limit);
        summary.getData().setSites(sites);
        for (Sites s : sites) {
            String darkSkyUrl = String.format("%s/%s/%s,%s?units=auto&exclude=hourly,daily",
                    darkSkyBaseUrl, darkSkyKey, s.getSite_lat(), s.getSite_lon());
            WeatherData weatherData = restTemplate.getForObject(darkSkyUrl, WeatherData.class);
            s.setWeatherData(weatherData);
        }
        return summary;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "List weather conditions", notes = "Get weather conditions at all sites")
    public SitesDetails getWeather(@PathVariable String id) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("https://waterpoint-engine-challenge-dev.mybluemix.net/sensors/site/%s", id);
        SitesDetails sitesDetails = restTemplate.getForObject(url, SitesDetails.class);
        assert sitesDetails != null;
        String darkSkyUrl = String.format("%s/%s/%s,%s?units=auto&exclude=hourly,daily", darkSkyBaseUrl, darkSkyKey,
                sitesDetails.getData().getSite_lat(), sitesDetails.getData().getSite_lon());
        WeatherData weatherData = restTemplate.getForObject(darkSkyUrl, WeatherData.class);
        sitesDetails.setWeatherData(weatherData);
        return sitesDetails;
    }

    private static <T> List<T> getPage(List<T> sourceList, int page, int pageSize) {
        if (pageSize <= 0 || page <= 0) {
            throw new IllegalArgumentException("invalid page size: " + pageSize);
        }
        int fromIndex = (page - 1) * pageSize;
        if (sourceList == null || sourceList.size() < fromIndex) {
            return Collections.emptyList();
        }
        // toIndex exclusive
        return sourceList.subList(fromIndex, Math.min(fromIndex + pageSize, sourceList.size()));
    }
}
