package com.demo.controler;

import com.demo.service.AnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AnnotationController {
    private AnnotationService annotationService;
    @Autowired
    public void setAnnotationService(AnnotationService annotationService){
        this.annotationService=annotationService;

    }
    public void addUser(){
        System.out.println("准备开始添加用户");
        annotationService.addUser();
    }
}
