package Controller;

import Service.IAnnotationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AnnotationContorller {
    private IAnnotationService annotationService;

    @Autowired
    public void setAnnotationService(IAnnotationService annotationService){
        this.annotationService = annotationService;
    }

    public void addUser(){
        System.out.println("准备add用户");
        annotationService.addUser();
    }
}
