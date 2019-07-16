package com.zt.spring.f_annotation.web;

import com.zt.spring.f_annotation.SpringInfo;
import com.zt.spring.f_annotation.web.controller.AnnotationController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestController {

    @Test
    public void now() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\maven_25781\\src\\main\\java\\com\\zt\\spring\\f_annotation\\web\\applicationContext.xml");
        AnnotationController annotationController = (AnnotationController) applicationContext.getBean("annotationController");
        annotationController.addUser();
    }
}
