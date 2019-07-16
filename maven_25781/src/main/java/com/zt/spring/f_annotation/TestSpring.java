package com.zt.spring.f_annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

    @Test
    public void before() {
        SpringInfo springInfo = new SpringInfo();
        springInfo.setInfo("Hello Spring Ioc before");
        System.out.println(springInfo.getInfo());
    }

    @Test
    public void now() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\maven_25781\\src\\main\\java\\com\\zt\\spring\\f_annotation\\applicationContext.xml");
        SpringInfo springInfo = (SpringInfo) applicationContext.getBean("springInfo");
        springInfo.setInfo("Hello Spring Ioc now");
        System.out.println(springInfo.getInfo());
    }

}
