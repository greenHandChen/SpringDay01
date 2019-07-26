package com.hand.zuulgatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZuulGatwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGatwayApplication.class, args);
    }

}
