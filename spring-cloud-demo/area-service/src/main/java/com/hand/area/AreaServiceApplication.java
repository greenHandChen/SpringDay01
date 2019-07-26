package com.hand.area;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.hand.area.dao")
public class AreaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AreaServiceApplication.class, args);
    }

}
