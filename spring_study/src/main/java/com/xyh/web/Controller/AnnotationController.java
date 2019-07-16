package com.xyh.web.Controller;

import com.xyh.web.Service.AnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("annotationController")
public class AnnotationController {

    @Autowired
    @Qualifier("annotationService")
    private AnnotationService annotationService;

    public void addUser() {
        System.out.println("controller层");
        annotationService.addUser();
    }
}
