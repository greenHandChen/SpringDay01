package com.ljx.extensionserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ExtensionServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExtensionServerApplication.class, args);
    }

}
