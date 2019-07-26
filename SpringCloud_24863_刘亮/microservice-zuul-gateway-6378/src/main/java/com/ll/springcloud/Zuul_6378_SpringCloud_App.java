package com.ll.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @package com.ll.springcloud
 * @Author LL
 * @ClassName Zuul_6378_SpringCloud_App
 * @Date 2019/7/26  17:23
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_6378_SpringCloud_App {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_6378_SpringCloud_App.class,args);
    }
}
