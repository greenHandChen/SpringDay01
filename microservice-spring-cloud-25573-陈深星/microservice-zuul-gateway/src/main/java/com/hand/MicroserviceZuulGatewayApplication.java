package com.hand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


@EnableZuulProxy
@SpringBootApplication
public class MicroserviceZuulGatewayApplication {

    public static void main(String[] args) {

        SpringApplication.run(MicroserviceZuulGatewayApplication.class, args);

    }


}
