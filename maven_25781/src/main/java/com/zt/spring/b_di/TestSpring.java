package com.zt.spring.b_di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

    @Test
    public void now() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\maven_25781\\src\\main\\java\\com\\zt\\spring\\b_di\\applicationContext.xml");
        SpringInfo springInfo = (SpringInfo) applicationContext.getBean("springInfo");
        springInfo.getDiSpring().helloDiSpring();
    }

}
