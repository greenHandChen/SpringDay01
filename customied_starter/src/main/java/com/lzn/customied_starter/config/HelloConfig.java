package com.lzn.customied_starter.config;

import com.lzn.customied_starter.IHelloSpringBoot;
import com.lzn.customied_starter.imp.HelloSpringBoot;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(HelloSpringBoot.class)
public class HelloConfig {
   @Bean("helloSpringBoot")
   @ConditionalOnMissingBean(HelloSpringBoot.class)
   public IHelloSpringBoot helloSpringBoot() {
       IHelloSpringBoot helloSpringBoot = new HelloSpringBoot();
       return helloSpringBoot;
   }
}
