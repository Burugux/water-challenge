package com.ibm.waterchallenge.models;

public class YieldDaily {
    private String zero_yield_daily_count;

    private String medium_yield_daily_count;

    private String low_yield_daily_count;

    private String high_yield_daily_count;

    public String getZero_yield_daily_count() {
        return zero_yield_daily_count;
    }

    public void setZero_yield_daily_count(String zero_yield_daily_count) {
        this.zero_yield_daily_count = zero_yield_daily_count;
    }

    public String getMedium_yield_daily_count() {
        return medium_yield_daily_count;
    }

    public void setMedium_yield_daily_count(String medium_yield_daily_count) {
        this.medium_yield_daily_count = medium_yield_daily_count;
    }

    public String getLow_yield_daily_count() {
        return low_yield_daily_count;
    }

    public void setLow_yield_daily_count(String low_yield_daily_count) {
        this.low_yield_daily_count = low_yield_daily_count;
    }

    public String getHigh_yield_daily_count() {
        return high_yield_daily_count;
    }

    public void setHigh_yield_daily_count(String high_yield_daily_count) {
        this.high_yield_daily_count = high_yield_daily_count;
    }

    @Override
    public String toString() {
        return "ClassPojo [zero_yield_daily_count = " + zero_yield_daily_count + ", medium_yield_daily_count = " + medium_yield_daily_count + ", low_yield_daily_count = " + low_yield_daily_count + ", high_yield_daily_count = " + high_yield_daily_count + "]";
    }
}
