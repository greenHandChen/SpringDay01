package com.txz.zuuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZullApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZullApplication.class);
    }
}
