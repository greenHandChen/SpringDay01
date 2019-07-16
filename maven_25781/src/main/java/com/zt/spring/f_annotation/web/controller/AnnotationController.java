package com.zt.spring.f_annotation.web.controller;

import com.zt.spring.f_annotation.web.service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AnnotationController {
    private IAnnotationService iAnnotationService;

    @Autowired
    public void setiAnnotationService(IAnnotationService iAnnotationService) {
        this.iAnnotationService = iAnnotationService;
    }

    public void addUser() {
        System.out.println("准备开始添加...");
        iAnnotationService.addUser();
    }
}
