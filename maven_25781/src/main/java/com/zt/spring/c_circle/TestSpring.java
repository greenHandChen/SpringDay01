package com.zt.spring.c_circle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

    @Test
    public void now() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\maven_25781\\src\\main\\java\\com\\zt\\spring\\c_circle\\applicationContext.xml");
        SpringInfo springInfo = (SpringInfo) applicationContext.getBean("springInfo");
        springInfo.initBean();
        springInfo.destoryBean();
    }

}
