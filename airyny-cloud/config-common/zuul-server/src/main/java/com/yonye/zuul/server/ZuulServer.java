package com.yonye.zuul.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author:Yonye
 * @Date:2019/7/26 9:18
 * @Version:1.0
 * @deseription:
 **/
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulServer {

    public static void main(String[] args){
        SpringApplication.run(ZuulServer.class,args);
    }
}
