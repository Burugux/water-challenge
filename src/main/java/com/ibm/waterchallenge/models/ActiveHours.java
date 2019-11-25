package com.ibm.waterchallenge.models;

public class ActiveHours {
    private String zero_active_hours_count;

    private String low_active_hours_count;

    private String medium_active_hours_count;

    private String high_active_hours_count;

    public String getZero_active_hours_count() {
        return zero_active_hours_count;
    }

    public void setZero_active_hours_count(String zero_active_hours_count) {
        this.zero_active_hours_count = zero_active_hours_count;
    }

    public String getLow_active_hours_count() {
        return low_active_hours_count;
    }

    public void setLow_active_hours_count(String low_active_hours_count) {
        this.low_active_hours_count = low_active_hours_count;
    }

    public String getMedium_active_hours_count() {
        return medium_active_hours_count;
    }

    public void setMedium_active_hours_count(String medium_active_hours_count) {
        this.medium_active_hours_count = medium_active_hours_count;
    }

    public String getHigh_active_hours_count() {
        return high_active_hours_count;
    }

    public void setHigh_active_hours_count(String high_active_hours_count) {
        this.high_active_hours_count = high_active_hours_count;
    }

    @Override
    public String toString() {
        return "ClassPojo [zero_active_hours_count = " + zero_active_hours_count + ", low_active_hours_count = " + low_active_hours_count + ", medium_active_hours_count = " + medium_active_hours_count + ", high_active_hours_count = " + high_active_hours_count + "]";
    }
}
