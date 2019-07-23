package com.hand.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloSpringBootAutoConfigure {


    @Bean
    @ConditionalOnMissingBean(HelloSpringBoot.class)
    public HelloSpringBoot helloSpringBoot() {

        HelloSpringBoot helloSpringBoot = new HelloSpringBoot();

        return helloSpringBoot;

    }
}
