package com.ceh.spring.controller;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationControllerTest {

    @Test
    public void add() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        AnnotationController annotationController = applicationContext.getBean("annotationController", AnnotationController.class);
        annotationController.addUser();

    }
}