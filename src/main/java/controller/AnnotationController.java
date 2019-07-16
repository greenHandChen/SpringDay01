package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.IAnnotationService;

@Controller
public class AnnotationController {

    @Autowired
    private IAnnotationService iAnnotationService;

    public void setiAnnotationService(IAnnotationService iAnnotationService) {
        this.iAnnotationService = iAnnotationService;
    }

    public void addUser(){
        iAnnotationService.add();
    }
}
