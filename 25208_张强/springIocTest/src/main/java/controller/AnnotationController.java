package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.IAnnotationService;

/**
 * Created by zq on 2019/7/16
 */
@Controller
public class AnnotationController {
    private IAnnotationService annotationService;
    @Autowired
    public void setAnnotationService(IAnnotationService annotationService) {
        this.annotationService = annotationService;
    }
    public void addUser(){
        System.out.println("准备开始添加用户。。。");
        annotationService.addUser();
    }
}
