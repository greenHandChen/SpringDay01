package com.ceh.spring.g_framework.controller;

import com.ceh.spring.g_framework.service.IAnnotationService;
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
        System.out.println("准备开始add user");
        // 调用添加方法
        annotationService.addUser();
    }

}
