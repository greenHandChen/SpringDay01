package com.hand;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(value = "com.hand.mapper")
@EnableFeignClients
public class SpringcloudUsermanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudUsermanageApplication.class, args);
    }

}
