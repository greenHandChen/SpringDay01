package com.hand.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author xiongyilin
 * @Date 2019/7/23 20:15
 * @Version 1.0
 */

// 相当于一个普通的 java 配置类
@Configuration

public class HelloServiceAutoConfiguration {


    @Bean
    // 当容器没有这个 Bean 的时候才创建这个 Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService() {
        HelloService service = new HelloService();
        return service;
    }
}