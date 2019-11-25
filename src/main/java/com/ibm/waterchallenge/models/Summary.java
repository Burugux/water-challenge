package com.ibm.waterchallenge.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Summary {
    private String statusCode;
    private String statusMessage;
    private SummaryData data;
    private String success;

    public SummaryData getData() {
        return data;
    }

    public void setData(SummaryData summaryData) {
        this.data = summaryData;
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
        return "SummarySites{" +
                "statusCode='" + statusCode + '\'' +
                ", statusMessage='" + statusMessage + '\'' +
                ", data=" + data +
                ", success='" + success + '\'' +
                '}';
    }
}
