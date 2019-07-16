package com.yonye.controller;


import com.yonye.service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("annotationController")
public class AnnotationController {

    @Autowired

    private IAnnotationService annotationService;


//    public void setAnnotationService(IAnnotationService annotationService){
//        this.annotationService=annotationService;
//    }

    public void addUser(){
        System.out.println("准备开始添加用户。。。。");

        annotationService.addUser();
    }
}
