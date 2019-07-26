package com.hand.country;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.hand.country.mapper"})
public class CountryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CountryApplication.class, args);
    }

}
