package com.hand.eureka.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 开启Eureka服务发现
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaRegisterApplication.class, args);
    }

}
