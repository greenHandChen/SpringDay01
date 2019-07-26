package com.yonye.config.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import javax.swing.*;

/**
 * @Author:Yonye
 * @Date:2019/7/25 23:14
 * @Version:1.0
 * @deseription:
 **/
@EnableConfigServer
@SpringBootApplication
public class ConfigServer {

    public static void main(String[] args){
        SpringApplication.run(ConfigServer.class,args);
    }
}
