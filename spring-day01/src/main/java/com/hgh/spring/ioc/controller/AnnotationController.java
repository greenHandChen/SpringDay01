package com.hgh.spring.ioc.controller;

import com.hgh.spring.ioc.service.AnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AnnotationController {
    @Autowired
    private AnnotationService annotationService;

    public void addUser(){
        System.out.println("准备开始添加用户...");
        annotationService.addUser();
    }
}
