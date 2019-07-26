package com.airyny.service.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author:Yonye
 * @Date:2019/7/26 11:02
 * @Version:1.0
 * @deseription:
 **/
@MapperScan(basePackages = "com.airyny.service.user.mapper")
@EnableAutoConfiguration
@SpringBootApplication
public class APP {

    public static void main(String[] args){
        SpringApplication.run(APP.class,args);
    }
}