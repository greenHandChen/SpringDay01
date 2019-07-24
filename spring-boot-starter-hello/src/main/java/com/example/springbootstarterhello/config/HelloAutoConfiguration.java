package com.example.springbootstarterhello.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//配置类
@EnableConfigurationProperties(HelloProperties.class)//开启使用映射实体对象
@ConditionalOnClass(HelloSpringBoot.class)//存在HelloSpringBoot JavaBEan时初始化该配置类
@ConditionalOnProperty
        //初始化代码块
        (
                prefix = "hello",//存在配置前缀hello
                value = "enabled",
                matchIfMissing = true//缺失检查
        )
public class HelloAutoConfiguration {
    //application.properties配置文件映射前缀实体对象
    @Autowired
    private HelloProperties helloProperties;

    //不存在HelloSpringBoot时创建JavaBean注入到Spring容器
    @Bean
    @ConditionalOnMissingBean(HelloSpringBoot.class)//判断条件：不存在HelloSpringBoot JavaBean时执行
    public HelloSpringBoot helloSpringBoot() {
        System.out.println(">>>Spring容器中没有 : id为HelloSpringBoot的Bean , 已创建并自动注入");
        HelloSpringBoot helloSpringBoot = new HelloSpringBoot();
        helloSpringBoot.setMsg(helloProperties.getMsg());//设置消息内容
        return helloSpringBoot;
    }
}