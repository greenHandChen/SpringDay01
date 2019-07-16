package com.lhb.spring.annotation_web.controller;

import com.lhb.spring.annotation_web.service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created By LHB on 2019/7/16;
 */
@Controller("annotationController")
public class AnnotationController {

    private IAnnotationService annotationService;
    @Autowired
    public void setAnnotationService(IAnnotationService annotationService) {
        this.annotationService = annotationService;
    }

    public void addUser() {
        System.out.println("准备开始添加用户");
        annotationService.addUser();
    }

}
