package com.example.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceApplication  extends SpringBootServletInitializer {

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(ServiceApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }

}
