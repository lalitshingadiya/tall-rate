package com.ecw.tallrate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

@SpringBootApplication
public class TallRateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TallRateApplication.class, args);
    }

    @Bean
    public Supplier<FastPassToll> generateTollCharge(){
        return () -> new FastPassToll("800","1001",1.05f);
    }
}
