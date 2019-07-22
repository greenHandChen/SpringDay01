package com.ceh.spring.f_annotation.web.controller;

import com.ceh.spring.f_annotation.web.service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by enHui.Chen on 2019/7/16.
 */
@Controller
public class AnnotationController {
    private IAnnotationService annotationService;

    @Autowired
    public void setAnnotationService(IAnnotationService annotationService) {
        this.annotationService = annotationService;
    }

    public void addUser(){
        System.out.println("准备开始添加......");
        annotationService.addUser();
    }
}
