package com.zt.eureka_producer_ext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProducerExtApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProducerExtApplication.class, args);
    }

}
