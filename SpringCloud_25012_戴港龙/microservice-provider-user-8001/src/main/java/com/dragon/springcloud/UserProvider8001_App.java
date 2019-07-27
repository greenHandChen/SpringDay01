package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @package com.ll.springcloud
 * @Author LL
 * @ClassName UserProvider8001_App
 * @Date 2019/7/26  15:52
 */
@SpringBootApplication
@EnableEurekaClient
public class UserProvider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(UserProvider8001_App.class,args);
    }
}
