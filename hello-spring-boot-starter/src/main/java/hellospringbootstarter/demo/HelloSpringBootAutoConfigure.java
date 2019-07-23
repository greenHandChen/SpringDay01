package com.hand.example.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloSpringBootImpl.class)
public class HelloSpringBootAutoConfigure {

    @Bean
    @ConditionalOnMissingBean
    HelloSpringBootImpl helloSpringBootImpl() {

        return new HelloSpringBootImpl();

    }



}
