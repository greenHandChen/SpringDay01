package com.hand.po;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Controller
public class AnnotationController {
    @Autowired
    private AnnotationService annotationService;

    public void add(){
        System.out.println("Controller开始添加用户");
        annotationService.add();
    }
}
