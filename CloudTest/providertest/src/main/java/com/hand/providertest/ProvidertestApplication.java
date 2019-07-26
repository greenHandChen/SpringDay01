package com.hand.providertest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@MapperScan("com.hand.providertest.Mapper")
public class ProvidertestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvidertestApplication.class, args);
    }

}
