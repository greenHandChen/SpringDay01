package com.yts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AnnotationController {

    private IAnnotationService annotationService;

    @Autowired
    private void setAnnotationService(IAnnotationService annotationService){
        this.annotationService = annotationService;
    }

    public void addUser(){
        System.out.println("准备开始添加用户。。。");
        annotationService.addUser();
    }
}
