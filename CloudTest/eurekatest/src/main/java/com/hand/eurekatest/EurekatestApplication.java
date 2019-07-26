package com.hand.eurekatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekatestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekatestApplication.class, args);
    }

}
