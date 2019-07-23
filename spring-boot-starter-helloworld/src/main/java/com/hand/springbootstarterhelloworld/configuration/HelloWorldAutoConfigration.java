package com.hand.springbootstarterhelloworld.configuration;

import com.hand.springbootstarterhelloworld.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/23 19:32
 */
@Configuration
@ConditionalOnClass({HelloService.class})
public class HelloWorldAutoConfigration {

    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService()
    {
        HelloService helloService = new HelloService();
        return helloService;
    }
}


