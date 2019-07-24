package com.hand.mike.hellospringbootstarter.bean;

import com.hand.mike.hellospringbootstarter.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SayHelloStarterBean {

    @ConditionalOnMissingBean
    @Bean
    public HelloService GetHelloMsg(){
        HelloService helloService = new HelloService();
        helloService.setMsg("hello SpringBoot");
        return helloService;
    }
}
