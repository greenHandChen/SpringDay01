package com.hand.hellostarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 王俊
 * @Date: 2019/7/23 19:26
 **/
@Configuration
@ConditionalOnClass(HelloSpringBoot.class)
public class HelloAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean(HelloSpringBoot.class)
    public HelloSpringBoot helloService() {
        HelloSpringBoot helloSpringBoot = new HelloSpringBoot();
        return helloSpringBoot;
    }

}
