package com.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.webapp.service.IAnnotationService;

@Controller
public class AnnotationController {
    private IAnnotationService annotationService;

    @Autowired
    public void setAnnotationService(IAnnotationService annotationService){
        this.annotationService = annotationService;
    }
    public void addUser(){
        System.out.println("准备开始添加新用户");
        annotationService.addUser();
    }
}
