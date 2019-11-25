package com.ibm.waterchallenge.models;

public class SiteUptimes {
    private String unknown_up_time_count;

    private String low_up_time_count;

    private String medium_up_time_count;

    private String high_up_time_count;

    public String getUnknown_up_time_count() {
        return unknown_up_time_count;
    }

    public void setUnknown_up_time_count(String unknown_up_time_count) {
        this.unknown_up_time_count = unknown_up_time_count;
    }

    public String getLow_up_time_count() {
        return low_up_time_count;
    }

    public void setLow_up_time_count(String low_up_time_count) {
        this.low_up_time_count = low_up_time_count;
    }

    public String getMedium_up_time_count() {
        return medium_up_time_count;
    }

    public void setMedium_up_time_count(String medium_up_time_count) {
        this.medium_up_time_count = medium_up_time_count;
    }

    public String getHigh_up_time_count() {
        return high_up_time_count;
    }

    public void setHigh_up_time_count(String high_up_time_count) {
        this.high_up_time_count = high_up_time_count;
    }

    @Override
    public String toString() {
        return "ClassPojo [unknown_up_time_count = " + unknown_up_time_count + ", low_up_time_count = " + low_up_time_count + ", medium_up_time_count = " + medium_up_time_count + ", high_up_time_count = " + high_up_time_count + "]";
    }
}
