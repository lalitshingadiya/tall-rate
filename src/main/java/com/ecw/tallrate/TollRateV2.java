package com.ecw.tallrate;

public class TollRateV2 {

    private String stationId;
    private Float currentRate;
    private String timestamp;

    private Boolean isBaseRate;

    public TollRateV2(){}

    public TollRateV2(String stationId, Float currentRate, String timestamp,Boolean isBaseRate) {
        this.stationId = stationId;
        this.currentRate = currentRate;
        this.timestamp = timestamp;
        this.isBaseRate = isBaseRate;
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

    public Boolean getIsBaseRate(){return isBaseRate;}

    public void setIsBaseRate(Boolean isBaseRate){this.isBaseRate=isBaseRate;}
}
