package com.example.springcloudconsulclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@MapperScan("com.example.springcloudconsulclient.mapper")
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class SpringCloudConsulClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsulClientApplication.class, args);
    }

}
