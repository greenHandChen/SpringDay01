package com.hand.config;

import com.hand.bean.SayHello;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SayHello.class)
public class StarterAutoConfig {

    private SayHello sayHello;

    public StarterAutoConfig(SayHello sayHello) {
        this.sayHello = sayHello;
    }

    @Bean
    @ConditionalOnMissingBean
    public SayHello sayHello(){
        return new SayHello();
    }
}

