package f_annotation.web.controller;

import f_annotation.web.service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller(value = "annotationController")
public class AnnotationController {
    private IAnnotationService annotationService;

    //Autowired可以注解在方法上，也可以注解在属性上,一般需要配合@Qualifier(value = "")使用
    @Autowired

    public void setAnnotationService(IAnnotationService annotationService) {
        this.annotationService = annotationService;
    }

    public void addUser(){
        System.out.println("准备开始添加用户");
        annotationService.addUser();
    }
}
