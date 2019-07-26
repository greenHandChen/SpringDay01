package com.example.springcloudconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsulApplication.class, args);
    }

}
