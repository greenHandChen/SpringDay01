package com.ceh.spring.e_inject.a_constructor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class CollectionBeanTest {
    private ApplicationContext applicationContext = null;
    private  CollectionBean c = null;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("beans5.xml");
        c = (CollectionBean) applicationContext.getBean("collectionBean");


    }

    @After
    public void tearDown() throws Exception {
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }

    @Test
    public void toString1() {
        System.out.println(c.toString());
    }
}