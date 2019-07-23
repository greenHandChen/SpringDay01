package com.example.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.example.springbootdemo.mapper")
public class SpringbootdemoApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootdemoApplication.class, args);

    }

}
