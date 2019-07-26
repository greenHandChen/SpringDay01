package com.hand.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 开启客户端发现
 * @author Fandelu
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerUserApplication.class, args);
    }

}
