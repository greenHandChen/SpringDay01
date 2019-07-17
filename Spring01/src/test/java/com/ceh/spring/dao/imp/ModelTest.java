package com.ceh.spring.dao.imp;

import com.ceh.spring.e_inject.a_constructor.CollectionBean;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class ModelTest {
    private Model model = null;

    @Before
    public void setUp() throws Exception {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mySpring.xml");
        System.out.println("first:" + applicationContext.getBean("myModel"));
        System.out.println("second:" + applicationContext.getBean("myModel"));
        model = (Model) applicationContext.getBean("myModel");
    }

    @Test
    public void catSay() {
        model.catSay();
    }
}