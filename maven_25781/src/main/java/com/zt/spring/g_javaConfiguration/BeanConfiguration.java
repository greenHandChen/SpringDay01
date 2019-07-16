package com.zt.spring.g_javaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {

    @Scope
    @Bean("getSpringInfoBean") //没有指定name则默认方法名
    public SpringInfo getSpringInfo(@Autowired Student student) {
        SpringInfo springInfo = new SpringInfo();
        student.setCode("25781");
        springInfo.setStudent(student);
        springInfo.setInfo("Spring info java Config");
        return springInfo;
    }
}
