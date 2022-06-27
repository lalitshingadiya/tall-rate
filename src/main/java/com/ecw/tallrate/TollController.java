package com.ecw.tallrate;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TollController {

    private List<TollRate> tollRates;
    private List<TollRateV2> tollRateV2;

    public TollController() {
        this.tollRates = new ArrayList<TollRate>();
        this.tollRates.add(new TollRate("1000",0.55f, Instant.now().toString()));
        this.tollRates.add(new TollRate("1001",1.05f,Instant.now().toString()));
        this.tollRates.add(new TollRate("1002",0.60f,Instant.now().toString()));
        this.tollRates.add(new TollRate("1003",1.00f,Instant.now().toString()));

        this.tollRateV2 = new ArrayList<TollRateV2>();
        this.tollRateV2.add(new TollRateV2("1000",0.55f, Instant.now().toString(),Boolean.TRUE));
        this.tollRateV2.add(new TollRateV2("1001",1.05f,Instant.now().toString(),Boolean.TRUE));
        this.tollRateV2.add(new TollRateV2("1002",0.60f,Instant.now().toString(),Boolean.TRUE));
        this.tollRateV2.add(new TollRateV2("1003",1.00f,Instant.now().toString(),Boolean.TRUE));
    }

    @RequestMapping("/api/tolldata")
    public List<TollRate> listTollData(){
        return this.tollRates;
    }

    @RequestMapping("/tollrate/{stationId}")
    public TollRate getTollRate(@PathVariable String stationId){
        System.out.println("Station Id : " + stationId);
        return this.tollRates.stream().filter(t -> t.getStationId().equals(stationId)).findFirst().get();
    }

    @RequestMapping("/tollrateslow/{stationId}")
    public TollRate getTollRateSlow(@PathVariable String stationId) throws InterruptedException {
        System.out.println("Station Id : " + stationId);
        Thread.sleep(3000);
        return this.tollRates.stream().filter(t -> t.getStationId().equals(stationId)).findFirst().get();
    }

    @RequestMapping("/tollrateV2/{stationId}")
    public TollRateV2 getTollRateV2(@PathVariable String stationId){
        System.out.println("Station Id : " + stationId);
        return this.tollRateV2.stream().filter(t -> t.getStationId().equals(stationId)).findAny().orElse(new TollRateV2());
    }
}