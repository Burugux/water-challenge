package com.ibm.waterchallenge.controllers;

import com.ibm.waterchallenge.models.DailySensorReadings;
import com.ibm.waterchallenge.models.Sites;
import com.ibm.waterchallenge.models.Summary;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/sensor")
public class SensorController {

    @GetMapping("/daily-readings/{siteId}")
    @ApiOperation(value = "Get daily sensor readings", notes = "Get daily sensor readings at a site")
    public ResponseEntity<HashMap<String, Object>> getDailyReadings(@PathVariable String siteId,
                                                                    @RequestParam(required = false) String StartDate,
                                                                    @RequestParam(required = false) String EndDate) throws ParseException {
        if (StringUtils.isBlank(StartDate) || StringUtils.isBlank(EndDate)) {
            RestTemplate restTemplate = new RestTemplate();
            String url = String.format("https://waterpoint-engine-challenge-dev.mybluemix.net/sensors/daily-readings/%s",
                    siteId);
            DailySensorReadings dailySensorReadings = restTemplate.getForObject(url, DailySensorReadings.class);
            HashMap<String, Object> resp = new HashMap<>();
            resp.put("data", dailySensorReadings);
            return new ResponseEntity<>(resp, HttpStatus.OK);
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date startDate = formatter.parse(StartDate);
        Date endDate = formatter.parse(EndDate);

        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("https://waterpoint-engine-challenge-dev.mybluemix.net/sensors/daily-readings/%s",
                siteId);
        DailySensorReadings dailySensorReadings = restTemplate.getForObject(url, DailySensorReadings.class);

        assert dailySensorReadings != null;
        List<DailySensorReadings.Data> dataList = dailySensorReadings.getData().stream()
                .filter(d -> d.getLocalDate().after(startDate) && d.getLocalDate().before(endDate))
                .collect(Collectors.toList());

        dailySensorReadings.setData(dataList);
        HashMap<String, Object> resp = new HashMap<>();
        resp.put("items", dailySensorReadings);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @GetMapping("/daily-county-readings/{countyName}")
    @ApiOperation(value = "Get daily county sensor readings", notes = "Get daily sensor readings for a county")
    public ResponseEntity<HashMap<String, Object>> dailyCountyReadings(@PathVariable String countyName,
                                                                       @RequestParam(required = false, defaultValue = "1") int offset,
                                                                       @RequestParam(required = false, defaultValue = "10") int limit) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("https://waterpoint-engine-challenge-dev.mybluemix.net/sensors/daily-county-readings/%s", countyName);
        DailySensorReadings dailySensorReadings = restTemplate.getForObject(url, DailySensorReadings.class);

        assert dailySensorReadings != null;
        int count = dailySensorReadings.getData().size();
        List<DailySensorReadings.Data> dataList = getPage(dailySensorReadings.getData(), offset, limit);

        dailySensorReadings.setData(dataList);
        HashMap<String, Object> resp = new HashMap<>();
        resp.put("totalCount", count);
        resp.put("items", dailySensorReadings);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @GetMapping("/{siteName}")
    @ApiOperation(value = "Get summary for a site", notes = "Get site summary by site name")
    public ResponseEntity<HashMap<String, Object>> getSiteSummary(@RequestParam String siteName) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://waterpoint-engine-challenge-dev.mybluemix.net/sensors/sites/summary";
        Summary summary = restTemplate.getForObject(url, Summary.class);

        assert summary != null;

        for (Sites s : summary.getData().getSites()) {
            if (StringUtils.equalsIgnoreCase(s.getSite_name(), siteName)) {
                HashMap<String, Object> resp = new HashMap<>();
                resp.put("data", s);
                return new ResponseEntity<>(resp, HttpStatus.OK);
            }
        }
        HashMap<String, Object> resp = new HashMap<>();
        resp.put("data", String.format("No site with name %s was found", siteName));
        return new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
    }


    @GetMapping("/{coordinates}")
    @ApiOperation(value = "Get summary for coordinates", notes = "Get site summary by site coordinates")
    public ResponseEntity<HashMap<String, Object>> getSiteSummaryCoordinates(@RequestParam String latitude,
                                                                             @RequestParam String longitude) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://waterpoint-engine-challenge-dev.mybluemix.net/sensors/sites/summary";
        Summary summary = restTemplate.getForObject(url, Summary.class);

        assert summary != null;

        for (Sites s : summary.getData().getSites()) {
            if (StringUtils.equalsIgnoreCase(s.getSite_lat(), latitude) && StringUtils.equalsIgnoreCase(s.getSite_lon(), longitude)) {
                HashMap<String, Object> resp = new HashMap<>();
                resp.put("data", s);
                return new ResponseEntity<>(resp, HttpStatus.OK);
            }
        }
        HashMap<String, Object> resp = new HashMap<>();
        resp.put("data", String.format("No site with latitude %s and longitude %s was found", latitude, longitude));
        return new ResponseEntity<>(resp, HttpStatus.NOT_FOUND);
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
