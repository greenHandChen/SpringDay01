package com.hgh.spring.ioc.bean.config;

import com.hgh.spring.ioc.bean.test_Annotation.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.hgh.spring.ioc.bean.test_Annotation","com.hgh.spring.ioc.controller","com.hgh.spring.ioc.dao","com.hgh.spring.ioc.service"})
public class MainConfig {
    @Bean
    public Person person(){
        return new Person();
    }
}
