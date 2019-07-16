package com.hand.TestSpring.Controller;

import com.hand.TestSpring.Service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("annotationController")
public class AnnotationController {
    private IAnnotationService annotationService;
    @Autowired
    public void setAnnotationService(IAnnotationService annotationService){
        this.annotationService=annotationService;
    }
    public void addUser(){
        System.out.println("准备开始添加用户。。。");
        annotationService.addUser();
    }
}
