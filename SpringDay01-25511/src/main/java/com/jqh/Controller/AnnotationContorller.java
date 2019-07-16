package com.jqh.Controller;

import com.jqh.Service.AnnotationService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class AnnotationContorller {
    private AnnotationService annotationService;

    @Resource
    public void setAnnotationService(AnnotationService annotationService){
        this.annotationService = annotationService;
    }

    public void addUser(){
        annotationService.addUser();
    }
}
