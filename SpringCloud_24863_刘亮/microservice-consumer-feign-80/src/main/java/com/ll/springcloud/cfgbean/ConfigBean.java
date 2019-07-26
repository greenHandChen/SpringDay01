package com.ll.springcloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @package com.ll.com.ll.springcloud.cfgbean
 * @Author LL
 * @ClassName ConfigBean    注解版配置类
 * @Date 2019/7/23  9:55
 */

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced       //Spring Cloud Ribbon是基于NetFlix Ribbon提供的一个客户端负载均衡工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    //更换一下Ribbon实现负载均衡的算法
    @Bean
    public IRule myRule(){
//        return new RoundRobinRule();       //使用轮询算法
//        return new RetryRule();   //retryRule
        return new RoundRobinRule();       //使用随机算法

    }

}
