package com.zt.spring.e_inject;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

    @Test
    public void now() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\maven_25781\\src\\main\\java\\com\\zt\\spring\\e_inject\\applicationContext.xml");
        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
        System.out.println(collectionBean.getList());
        System.out.println(collectionBean.getSet());
        System.out.println(collectionBean.getMap());
    }
}
