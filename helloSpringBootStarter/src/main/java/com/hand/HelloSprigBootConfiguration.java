package com.hand;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloSpringBoot.class)
public class HelloSprigBootConfiguration {
    @Bean
    @ConditionalOnMissingBean(HelloSpringBoot.class)
    public HelloSpringBoot  helloSpringBoot(){
        HelloSpringBoot hs=new HelloSpringBoot();
        hs.sayHello();
        return hs;
    }
}
