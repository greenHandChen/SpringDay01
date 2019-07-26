package com.course_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.course_server.mapper")
public class ClassServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClassServerApplication.class, args);
    }

}
