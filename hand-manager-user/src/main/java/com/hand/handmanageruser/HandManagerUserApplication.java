package com.hand.handmanageruser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.hand")
@EnableFeignClients
public class HandManagerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandManagerUserApplication.class, args);
    }

}
