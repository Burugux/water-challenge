package com.ibm.waterchallenge.models;

public class SitesDetails {
    private SitesData data;
    private String success;
    private String statusMessage;
    private String statusCode;
    private WeatherData weatherData;

    public SitesData getData() {
        return data;
    }

    public void setData(SitesData data) {
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

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public String toString() {
        return "SitesDetails{" +
                "data=" + data +
                ", success='" + success + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", weatherData=" + weatherData +
                '}';
    }

    public class SitesData {
        private String site_name;
        private String site_lon;
        private String doctype;
        private String date_pulled;
        private String mwater_id;
        private String asset_inventory;
        private String site_lat;
        private String yield_rate;
        private String county;

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

        public String getDoctype() {
            return doctype;
        }

        public void setDoctype(String doctype) {
            this.doctype = doctype;
        }

        public String getDate_pulled() {
            return date_pulled;
        }

        public void setDate_pulled(String date_pulled) {
            this.date_pulled = date_pulled;
        }

        public String getMwater_id() {
            return mwater_id;
        }

        public void setMwater_id(String mwater_id) {
            this.mwater_id = mwater_id;
        }

        public String getAsset_inventory() {
            return asset_inventory;
        }

        public void setAsset_inventory(String asset_inventory) {
            this.asset_inventory = asset_inventory;
        }

        public String getSite_lat() {
            return site_lat;
        }

        public void setSite_lat(String site_lat) {
            this.site_lat = site_lat;
        }

        public String getYield_rate() {
            return yield_rate;
        }

        public void setYield_rate(String yield_rate) {
            this.yield_rate = yield_rate;
        }

        public String getCounty() {
            return county;
        }

        public void setCounty(String county) {
            this.county = county;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "site_name='" + site_name + '\'' +
                    ", site_lon='" + site_lon + '\'' +
                    ", doctype='" + doctype + '\'' +
                    ", date_pulled='" + date_pulled + '\'' +
                    ", mwater_id='" + mwater_id + '\'' +
                    ", asset_inventory='" + asset_inventory + '\'' +
                    ", site_lat='" + site_lat + '\'' +
                    ", yield_rate='" + yield_rate + '\'' +
                    ", county='" + county + '\'' +
                    '}';
        }
    }
}
