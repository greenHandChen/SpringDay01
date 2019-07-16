package com.webapp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void run2(){
        ApplicationContext applicationContext =new  FileSystemXmlApplicationContext("E:\\IDEA\\workspace\\SpringDay1\\src\\main\\resources\\applicationXML\\applicationContext.xml");
        AnnotationController annotationController = (AnnotationController)applicationContext.getBean("annotationController");
        annotationController.addUser();
    }
}
