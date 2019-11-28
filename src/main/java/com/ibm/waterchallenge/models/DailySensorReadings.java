package com.ibm.waterchallenge.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailySensorReadings {
    private List<Data> data;
    private String success;
    private String statusMessage;
    private String statusCode;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "DailySensorReadings{" +
                "data=" + data +
                ", success='" + success + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }

    public static class Data {
        private String mlStatusPred;
        private String activeHours;
        private String county;
        private String siteName;
        private String expertStatus;
        private String households;
        private String siteLon;
        private String mWaterId;
        private String siteLat;
        private String ndma;
        private String id;
        private Date localDate;
        private String sensorBarcode;
        private String yieldDaily;
        private String expertStatusId;
        private String status;

        public String getMlStatusPred() {
            return mlStatusPred;
        }

        public void setMlStatusPred(String mlStatusPred) {
            this.mlStatusPred = mlStatusPred;
        }

        public String getActiveHours() {
            return activeHours;
        }

        public void setActiveHours(String activeHours) {
            this.activeHours = activeHours;
        }

        public String getCounty() {
            return county;
        }

        public void setCounty(String county) {
            this.county = county;
        }

        public String getSiteName() {
            return siteName;
        }

        public void setSiteName(String siteName) {
            this.siteName = siteName;
        }

        public String getExpertStatus() {
            return expertStatus;
        }

        public void setExpertStatus(String expertStatus) {
            this.expertStatus = expertStatus;
        }

        public String getHouseholds() {
            return households;
        }

        public void setHouseholds(String households) {
            this.households = households;
        }

        public String getSiteLon() {
            return siteLon;
        }

        public void setSiteLon(String siteLon) {
            this.siteLon = siteLon;
        }

        public String getMWaterId() {
            return mWaterId;
        }

        public void setMWaterId(String mWaterId) {
            this.mWaterId = mWaterId;
        }

        public String getSiteLat() {
            return siteLat;
        }

        public void setSiteLat(String siteLat) {
            this.siteLat = siteLat;
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

        public Date getLocalDate() {
            return localDate;
        }

        public void setLocalDate(Date localDate) {
            this.localDate = localDate;
        }

        public String getSensorBarcode() {
            return sensorBarcode;
        }

        public void setSensorBarcode(String sensorBarcode) {
            this.sensorBarcode = sensorBarcode;
        }

        public String getYieldDaily() {
            return yieldDaily;
        }

        public void setYieldDaily(String yieldDaily) {
            this.yieldDaily = yieldDaily;
        }

        public String getExpertStatusId() {
            return expertStatusId;
        }

        public void setExpertStatusId(String expertStatusId) {
            this.expertStatusId = expertStatusId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "mlStatusPred='" + mlStatusPred + '\'' +
                    ", activeHours='" + activeHours + '\'' +
                    ", county='" + county + '\'' +
                    ", siteName='" + siteName + '\'' +
                    ", expertStatus='" + expertStatus + '\'' +
                    ", households='" + households + '\'' +
                    ", siteLon='" + siteLon + '\'' +
                    ", mWaterId='" + mWaterId + '\'' +
                    ", siteLat='" + siteLat + '\'' +
                    ", ndma='" + ndma + '\'' +
                    ", id='" + id + '\'' +
                    ", localDate='" + localDate + '\'' +
                    ", sensorBarcode='" + sensorBarcode + '\'' +
                    ", yieldDaily='" + yieldDaily + '\'' +
                    ", expertStatusId='" + expertStatusId + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }
    }
}
