package com.ll.myruler;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @package com.ll.myruler
 * @Author LL
 * @ClassName MySelfRule
 * @Date 2019/7/25  14:49
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
//        return new RandomRule(); //Ribbon默认是轮询，现在自定义为随机
        return new Random_LL(); //Ribbon默认是轮询，现在自定义为随机
    }
}
