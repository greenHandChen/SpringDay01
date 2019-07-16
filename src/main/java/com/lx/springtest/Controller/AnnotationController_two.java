package com.lx.springtest.Controller;

import com.lx.springtest.Service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AnnotationController_two {
    private IAnnotationService annotationService;

    /**
     * 可以注解在setter方法上
     * @param annotationService
     */
    @Autowired
    public void setAnnotationService(IAnnotationService annotationService){
        this.annotationService = annotationService;
    }

    public void addUser(){
        annotationService.addUser();
    }
}
