package com.hand.handgatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class HandGatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandGatewayZuulApplication.class, args);
    }

}
