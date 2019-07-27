package com.example.ext_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.example.ext_server.mapper")
public class ExtServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExtServerApplication.class, args);
    }

}
