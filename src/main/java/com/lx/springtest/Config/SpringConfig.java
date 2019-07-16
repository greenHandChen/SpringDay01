package com.lx.springtest.Config;

import com.lx.springtest.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Person person(){
        return new Person("王五",35,"汉得");
    }
}
