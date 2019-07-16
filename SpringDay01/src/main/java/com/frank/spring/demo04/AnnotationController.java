package com.frank.spring.demo04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AnnotationController {
    private IAnnotationService annotationService;
    @Autowired
    public void setAnnotationService(IAnnotationService annotationService){
        this.annotationService = annotationService;
    }
    public void addUser(){
        System.out.println("准备开始添加用户...");
        annotationService.addUser();
    }
}
