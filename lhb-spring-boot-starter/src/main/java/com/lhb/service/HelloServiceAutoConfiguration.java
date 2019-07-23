package com.lhb.service;

/**
 * Created By LHB on 2019/7/23;
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication //web应该生效
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfiguration {

    @Autowired
    HelloProperties helloProperties;

    @Bean
    @Conditional({isExisBean.class})
    public HelloService helloService() {
        HelloService service = new HelloService();
        service.setHelloProperties( helloProperties  );
        return service;
    }
}
