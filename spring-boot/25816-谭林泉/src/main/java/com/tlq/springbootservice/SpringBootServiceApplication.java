package com.tlq.springbootservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class SpringBootServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServiceApplication.class, args);
    }

}
