package f_annotation.web2.controller;

import f_annotation.web2.service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller(value = "annotationController")
public class AnnotationController {
    private IAnnotationService annotationService;

    @Resource() //默认先以name查找，若查找类没有value属性，在根据type查找，和@Autowired用法类似
    public void setAnnotationService(IAnnotationService annotationService) {
        this.annotationService = annotationService;
    }

    public void addUser(){
        System.out.println("准备开始添加用户");
        annotationService.addUser();
    }
}
