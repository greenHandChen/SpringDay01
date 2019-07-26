package com.cloud.feigncustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeigncustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeigncustomerApplication.class, args);
    }

}
