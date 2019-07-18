package com.annotation.test;

import com.annotation.cn.AnnotationController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void testAnnotations(){
        ApplicationContext appCon=new ClassPathXmlApplicationContext("annotations-beans.xml");
        AnnotationController annotationController= (AnnotationController)appCon.getBean("annotationController");
        annotationController.addUser();
    }
}
