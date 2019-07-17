package com.spring01.demo2.controller;

import com.spring01.demo2.service.IAnnotationService;
import org.springframework.stereotype.Controller;

/**
 * Created by wangjie_fourth on 2019/7/16.
 */
@Controller
public class AnnotationController {

    private IAnnotationService annotationService;
    public void setAnnotationService(IAnnotationService annotationService) {
        this.annotationService = annotationService;
    }

    public void addUser(){
        System.out.println("准备开始添加用户....");
        annotationService.addUser();
    }
}
