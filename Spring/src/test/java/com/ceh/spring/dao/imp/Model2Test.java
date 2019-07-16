package com.ceh.spring.dao.imp;

import com.ceh.spring.service.IAnnotationService;
import com.ceh.spring.service.imp.AnnotationServiceImp;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class Model2Test {
    ApplicationContext applicationContext = null;
    private Model2 model2 = null;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("mySpring.xml");
        model2 = (Model2) applicationContext.getBean("myModel2");
    }

    @After
    public void tearDown() throws Exception {
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }

    @Test
    public void dogSay() {
        model2.dogSay();
    }
}