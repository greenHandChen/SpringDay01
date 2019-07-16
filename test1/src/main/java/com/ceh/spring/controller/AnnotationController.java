package com.ceh.spring.controller;

import com.ceh.spring.service.IAnnotationService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by HuangHeng on 2019/7/16
 */
@Controller
public class AnnotationController {
    @Qualifier("annotationService")
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
