package com.example.zuul;

import com.example.zuul.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
` `
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
