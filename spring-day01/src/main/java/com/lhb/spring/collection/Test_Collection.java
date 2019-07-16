package com.lhb.spring.collection;

import com.lhb.spring.bean_test.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By LHB on 2019/7/16;
 */
public class Test_Collection {
    @Test
    public void testList(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com.lhb.spring.ioc/applicationContext.xml");
        CollectionBean collection = (CollectionBean) applicationContext.getBean("collection");
        System.out.println(collection.getList());

    }

    @Test
    public void testArrary(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com.lhb.spring.ioc/applicationContext.xml");
        CollectionBean collection = (CollectionBean) applicationContext.getBean("collection");
        System.out.println(collection.toString());

    }
}
