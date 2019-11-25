package com.ibm.waterchallenge.models;

public class Sites {
    private String site_lat;
    private String county;
    private String households;
    private String site_uptime;
    private String local_date;
    private String site_name;
    private String site_lon;
    private String mwater_id;
    private String sensor_uptime;
    private String status_id;
    private String active_hours;
    private String yield_daily;
    private String sensor_barcode;
    private String ndma;
    private String id;
    private WeatherData weatherData;

    public String getSite_lat() {
        return site_lat;
    }

    public void setSite_lat(String site_lat) {
        this.site_lat = site_lat;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getHouseholds() {
        return households;
    }

    public void setHouseholds(String households) {
        this.households = households;
    }

    public String getSite_uptime() {
        return site_uptime;
    }

    public void setSite_uptime(String site_uptime) {
        this.site_uptime = site_uptime;
    }

    public String getLocal_date() {
        return local_date;
    }

    public void setLocal_date(String local_date) {
        this.local_date = local_date;
    }

    public String getSite_name() {
        return site_name;
    }

    public void setSite_name(String site_name) {
        this.site_name = site_name;
    }

    public String getSite_lon() {
        return site_lon;
    }

    public void setSite_lon(String site_lon) {
        this.site_lon = site_lon;
    }

    public String getMwater_id() {
        return mwater_id;
    }

    public void setMwater_id(String mwater_id) {
        this.mwater_id = mwater_id;
    }

    public String getSensor_uptime() {
        return sensor_uptime;
    }

    public void setSensor_uptime(String sensor_uptime) {
        this.sensor_uptime = sensor_uptime;
    }

    public String getStatus_id() {
        return status_id;
    }

    public void setStatus_id(String status_id) {
        this.status_id = status_id;
    }

    public String getActive_hours() {
        return active_hours;
    }

    public void setActive_hours(String active_hours) {
        this.active_hours = active_hours;
    }

    public String getYield_daily() {
        return yield_daily;
    }

    public void setYield_daily(String yield_daily) {
        this.yield_daily = yield_daily;
    }

    public String getSensor_barcode() {
        return sensor_barcode;
    }

    public void setSensor_barcode(String sensor_barcode) {
        this.sensor_barcode = sensor_barcode;
    }

    public String getNdma() {
        return ndma;
    }

    public void setNdma(String ndma) {
        this.ndma = ndma;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public String toString() {
        return "Sites{" +
                "site_lat='" + site_lat + '\'' +
                ", county='" + county + '\'' +
                ", households='" + households + '\'' +
                ", site_uptime='" + site_uptime + '\'' +
                ", local_date='" + local_date + '\'' +
                ", site_name='" + site_name + '\'' +
                ", site_lon='" + site_lon + '\'' +
                ", mwater_id='" + mwater_id + '\'' +
                ", sensor_uptime='" + sensor_uptime + '\'' +
                ", status_id='" + status_id + '\'' +
                ", active_hours='" + active_hours + '\'' +
                ", yield_daily='" + yield_daily + '\'' +
                ", sensor_barcode='" + sensor_barcode + '\'' +
                ", ndma='" + ndma + '\'' +
                ", id='" + id + '\'' +
                ", weatherData=" + weatherData +
                '}';
    }
}
