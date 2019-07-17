package com.ceh.spring.service.imp;

import com.ceh.spring.e_inject.a_constructor.CollectionBean;
import com.ceh.spring.service.IAnnotationService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class AnnotationServiceImpTest {
    private IAnnotationService annotationService = null;

    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mySpring.xml");
        annotationService = (AnnotationServiceImp)applicationContext.getBean("annotationService");
    }


    @Test
    public void addUser() {
        annotationService.addUser();
    }
}