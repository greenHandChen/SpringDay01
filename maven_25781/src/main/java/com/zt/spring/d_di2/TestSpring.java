package com.zt.spring.d_di2;

import com.zt.spring.d_di2.by_constructor.SpringInfo;
import com.zt.spring.d_di2.by_setter.SpringInfo2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

    @Test
    public void before() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\maven_25781\\src\\main\\java\\com\\zt\\spring\\d_di2\\by_constructor\\applicationContext.xml");
        SpringInfo springInfo = (SpringInfo) applicationContext.getBean("springInfoByConstructor");
        System.out.println(springInfo.toString());
    }

    @Test
    public void now() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\maven_25781\\src\\main\\java\\com\\zt\\spring\\d_di2\\by_setter\\applicationContext.xml");
        SpringInfo2 springInfo2 = (SpringInfo2) applicationContext.getBean("springInfoBySetter");
        System.out.println(springInfo2.toString());
    }

}
