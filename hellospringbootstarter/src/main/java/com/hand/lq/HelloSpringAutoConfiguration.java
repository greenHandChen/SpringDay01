package com.hand.lq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 相当于一个普通的 java 配置类
@Configuration
// 当 HelloworldService 在类路径的条件下
@ConditionalOnClass(HelloSpringBoot.class)
// 将 application.properties 的相关的属性字段与该类一一对应，并生成 Bean
@EnableConfigurationProperties(HelloSpringProperties.class)
public class HelloSpringAutoConfiguration {

    // 注入属性类
    @Autowired
    private HelloSpringProperties hellowordProperties;

    @Bean
    // 当容器没有这个 Bean 的时候才创建这个 Bean
    @ConditionalOnMissingBean(HelloSpringBoot.class)
    public HelloSpringBoot helloSpringBoot() {
        HelloSpringBoot helloSpringBoot = new HelloSpringBoot();
        helloSpringBoot.setWords(hellowordProperties.getWords());
        return helloSpringBoot;
    }
}