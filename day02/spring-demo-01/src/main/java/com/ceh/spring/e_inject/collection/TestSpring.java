package com.ceh.spring.e_inject.collection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Arrays;

/**
 * Created by enHui.Chen on 2019/7/16.
 */
public class TestSpring {
    @Test
    public void testCollection() {
        // 第一步加载applicationContext
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\芜湖培训\\spring\\day01\\培训内容\\test\\spring-demo-01\\src\\main\\java\\com\\ceh\\spring\\e_inject\\collection\\applicationContext.xml");
        // 第二步通过getBean获取bean
        CollectionBean collectionBean = applicationContext.getBean("collectionBean", CollectionBean.class);
        System.out.println("list集合:" + collectionBean.getList());
        System.out.println("数组:" + Arrays.toString(collectionBean.getArray()));
        System.out.println("set集合:" + collectionBean.getSet());
        System.out.println("set集合:" + collectionBean.getSet().getClass());
        System.out.println("map集合:" + collectionBean.getMap());
        System.out.println("map集合:" + collectionBean.getMap().getClass());
    }
}
