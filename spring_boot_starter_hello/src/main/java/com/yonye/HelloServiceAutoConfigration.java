package com.yonye;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:Yonye
 * @Date:2019/7/23 19:55
 * @Version:1.0
 * @deseription:
 **/
@Configuration
@ConditionalOnClass(HelloSpringBoot.class)
public class HelloServiceAutoConfigration {

    @Bean
    @ConditionalOnMissingBean(HelloSpringBoot.class)
    public HelloSpringBoot helloSpringBoot(){
        HelloSpringBoot helloSpringBoot=new HelloSpringBoot();
       return helloSpringBoot;
    }

}
