package com.lx.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.security.auth.login.Configuration;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigclientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigclientApplication.class, args);
    }
}
