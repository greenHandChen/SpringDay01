package com.zhang.countryprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class CountryProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CountryProviderApplication.class, args);
    }

}
