package com.dragon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @package com.ll.com.ll.springcloud
 * @Author LL
 * @ClassName DeptComsumer80_App
 * @Date 2019/7/23  10:15
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class DeptComsumerFeign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptComsumerFeign_App.class,args);
    }
}
