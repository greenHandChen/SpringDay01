package com.hand.handdiscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HandDiscoveryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandDiscoveryEurekaApplication.class, args);
    }

}
