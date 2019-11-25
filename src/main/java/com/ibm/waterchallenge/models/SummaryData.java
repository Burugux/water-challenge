package com.ibm.waterchallenge.models;

import java.util.List;
import java.util.Map;

public class SummaryData {
    private ActiveHours active_hours;
    private YieldDaily yield_daily;
    private SensorUptimes sensor_uptimes;
    private Map<String, String> statuses;
    private List<Sites> sites;
    private SiteUptimes site_uptimes;

    public ActiveHours getActive_hours() {
        return active_hours;
    }

    public void setActive_hours(ActiveHours active_hours) {
        this.active_hours = active_hours;
    }

    public YieldDaily getYield_daily() {
        return yield_daily;
    }

    public void setYield_daily(YieldDaily yield_daily) {
        this.yield_daily = yield_daily;
    }

    public SensorUptimes getSensor_uptimes() {
        return sensor_uptimes;
    }

    public void setSensor_uptimes(SensorUptimes sensor_uptimes) {
        this.sensor_uptimes = sensor_uptimes;
    }

    public Map<String, String> getStatuses() {
        return statuses;
    }

    public void setStatuses(Map<String, String> statuses) {
        this.statuses = statuses;
    }

    public List<Sites> getSites() {
        return sites;
    }

    public void setSites(List<Sites> sites) {
        this.sites = sites;
    }

    public SiteUptimes getSite_uptimes() {
        return site_uptimes;
    }

    public void setSite_uptimes(SiteUptimes site_uptimes) {
        this.site_uptimes = site_uptimes;
    }

    @Override
    public String toString() {
        return "Data{" +
                "active_hours=" + active_hours +
                ", yield_daily=" + yield_daily +
                ", sensor_uptimes=" + sensor_uptimes +
                ", statuses=" + statuses +
                ", sites=" + sites +
                ", site_uptimes=" + site_uptimes +
                '}';
    }
}