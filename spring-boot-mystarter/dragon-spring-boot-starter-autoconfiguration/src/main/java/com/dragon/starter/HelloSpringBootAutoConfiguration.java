package com.dragon.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 20:38 2019/7/23
 * @Modified By:
 */
//声明这是一个配置类
@Configuration
//ConditionalOnBean(XXX.class)--当前容器上下文是否存在bean为XXX,若不存在则不会实例化，存在才会实例化
//ConditionalOnMissingBean(XXX.class)--当前容器上下文是否存在bean为XXX,若不存在则实例化，存在不会实例化
@ConditionalOnMissingBean(HelloSpringBoot.class)
//@EnableConfigurationProperties使被@ConfigurationProperties注解的类生效（在当前类可以使用）
@EnableConfigurationProperties(HelloProperties.class)
public class HelloSpringBootAutoConfiguration {

    @Autowired
    private HelloProperties helloProperties;

    //@Bean注解主要是使用在@Configuration中
    //相当于<beans><bean id="helloSpringBoot" class="com.dragon.starter.HelloSpringBoot"/></beans>
    @Bean
    public HelloSpringBoot helloSpringBoot(){
        HelloSpringBoot helloSpringBoot=new HelloSpringBoot();
        helloSpringBoot.setHelloProperties(helloProperties);
        return helloSpringBoot;
    }
}
