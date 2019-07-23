package com.hello;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloSpringBoot.class)
public class HelloConfig {

    @Bean
    @ConditionalOnMissingBean
    public HelloSpringBoot helloSpringBoot(){
        return new HelloSpringBoot();
    }
}
