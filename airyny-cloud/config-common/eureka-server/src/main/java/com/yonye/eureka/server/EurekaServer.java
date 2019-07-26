package com.yonye.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author:Yonye
 * @Date:2019/7/26 9:09
 * @Version:1.0
 * @deseription:
 **/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {

    public static void main(String[] args){
        SpringApplication.run(EurekaServer.class,args);
    }
}
