package com.airyny.service.userInfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author:Yonye
 * @Date:2019/7/26 11:12
 * @Version:1.0
 * @deseription:
 **/
@MapperScan(basePackages = "com.airyny.service.userInfo.mapper")
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class UserInfoServer {
    public static void main(String[] args) {
        SpringApplication.run(UserInfoServer.class, args);
    }
}
