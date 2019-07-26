package com.example.additionifoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdditionifoserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdditionifoserviceApplication.class, args);
    }

}
