package com.ecw.tallrate;

public class TollRate {

    private String stationId;
    private Float currentRate;
    private String timestamp;

    public TollRate(String stationId, Float currentRate, String timestamp) {
        this.stationId = stationId;
        this.currentRate = currentRate;
        this.timestamp = timestamp;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public Float getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(Float currentRate) {
        this.currentRate = currentRate;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
