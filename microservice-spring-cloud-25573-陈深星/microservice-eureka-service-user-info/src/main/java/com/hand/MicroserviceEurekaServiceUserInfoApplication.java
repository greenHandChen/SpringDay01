package com.hand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceEurekaServiceUserInfoApplication {

    public static void main(String[] args) {

        SpringApplication.run(MicroserviceEurekaServiceUserInfoApplication.class, args);

    }

}
