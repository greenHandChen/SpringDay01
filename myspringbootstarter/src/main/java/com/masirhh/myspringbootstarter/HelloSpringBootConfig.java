package com.masirhh.myspringbootstarter;


import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass({HelloSpringBoot.class})
public class HelloSpringBootConfig {

    @Bean
   @ConditionalOnMissingClass("HelloSpringBoot.class")
   public HelloSpringBoot helloSpringBoot(){
       HelloSpringBoot helloSpringBoot=new HelloSpringBoot();
       return helloSpringBoot;
   }
}
