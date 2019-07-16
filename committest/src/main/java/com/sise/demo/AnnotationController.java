package com.sise.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class AnnotationController implements IAnnotationService{

    @Autowired
    @Qualifier("annotationRepository")
    private AnnotationRepository annotationRepository;

    public void addUser() {
        System.out.println("开始添加用户...");
        annotationRepository.addUser();
    }


}
