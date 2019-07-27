package com.example.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Service2Application {

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class, args);
    }

}
