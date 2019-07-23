package com.hand.starter.config;

import com.hand.starter.properties.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//开启配置
@EnableConfigurationProperties(HelloProperties.class)//开启使用映射实体对象
@ConditionalOnClass(HelloSpringBoot.class)//存在HelloSpringBoot时初始化该配置类
@ConditionalOnProperty//存在对应配置信息时初始化该配置类
        (
                prefix = "hello",//存在配置前缀hello
                value = "enabled",//开启
                matchIfMissing = true//缺失检查
         )
public class HelloAutoConfiguration {
    //application.yml配置文件映射前缀实体对象
    @Autowired
    private HelloProperties helloProperties;
    /**
     * 根据条件判断不存在HelloSpringBoot时初始化新的bean到SpringIOC中
     */
    @Bean//创建HelloSpringBoot
    @ConditionalOnMissingBean(HelloSpringBoot.class)////缺失HelloSpringBoot实体bean时，初始化HelloSpringBoot并添加到SpringIoc
    public HelloSpringBoot HelloSpringBoot(){
        System.out.println("----HelloSpringBoot这个Bean不存在，创建一个新的Bean----");
        HelloSpringBoot HelloSpringBoot=new HelloSpringBoot();
        HelloSpringBoot.setMsg(helloProperties.getMsg());
        return HelloSpringBoot;
    }
}
