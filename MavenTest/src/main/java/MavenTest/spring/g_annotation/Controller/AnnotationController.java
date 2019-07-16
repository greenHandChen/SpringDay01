package MavenTest.spring.g_annotation.Controller;

import MavenTest.spring.g_annotation.Service.IAnnotationService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AnnotationController {
    private IAnnotationService iAnnotationService;

    @Autowired
    public void setiAnnotationService(IAnnotationService iAnnotationService){
        this.iAnnotationService=iAnnotationService;
    }

    public void addUser(){
        System.out.println("准备开始添加用户...");
        iAnnotationService.addUser();
    }
}
