package com.tlq.hellostarter;

import com.tlq.hellostarter.HelloSpringBoot;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: Bean配置
 * @Author: TanLinQuan
 * @Date: 2019/7/23 20:14
 * @Version: V1.0
 **/
@Configuration
@ConditionalOnClass(HelloSpringBoot.class)
public class BeanConfig {

    @Bean
    @ConditionalOnClass(HelloSpringBoot.class)
    public HelloSpringBoot helloSpringBoot() {
        return new HelloSpringBoot();
    }
}
