package com.mystarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
public class HelloAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean()
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        return helloService;
    }
}
