package huanglehao.study.i_annotation.component.Controller;

import huanglehao.study.i_annotation.component.Service.IAnnotationService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Controller
public class AnnotationController {

    @Autowired
    @Qualifier("annotationService")
    private IAnnotationService annotationService;

    public void setAnnotationService(IAnnotationService annotationService){
        this.annotationService=annotationService;
    }

    @Test
    public void addUser(){
        System.out.println("开始准备添加用户");
        annotationService.addUser();
    }

}
