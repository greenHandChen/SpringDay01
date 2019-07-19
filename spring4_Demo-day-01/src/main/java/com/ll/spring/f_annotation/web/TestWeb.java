package com.ll.spring.f_annotation.web;

import com.ll.spring.f_annotation.Person;
import com.ll.spring.f_annotation.web.controller.AnnotationController;
import com.ll.spring.f_annotation.web.repository.IAnnotationRepository;
import com.ll.spring.f_annotation.web.repository.IAnnotationRepositoryImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestWeb {

    @Test
    public void demo(){
        AbstractApplicationContext context = new FileSystemXmlApplicationContext("D:\\IDEAWorkSpace\\SpringDay01\\spring4_Demo\\src\\main\\java\\com\\ll\\spring\\f_annotation\\beans.xml");

        IAnnotationRepositoryImpl annotationController = context.getBean("iannotationrepositoryimpl", IAnnotationRepositoryImpl.class);
        annotationController.addUser();
    }
}
