package spring_demo2.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import spring_demo2.Service.IAnnotationService;

@Controller
public class AnnotationController {

    @Autowired
    @Qualifier("annotationServiceImpl")
    private IAnnotationService annotationService;

//    @Autowired
//    public void setAnnotationService(IAnnotationService annotationService){
//        this.annotationService = annotationService;
//    }

    public void addUser(){
        System.out.println("准备开始添加用户...");
        annotationService.addUser();
    }
}
