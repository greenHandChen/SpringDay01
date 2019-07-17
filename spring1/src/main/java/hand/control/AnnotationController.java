package hand.control;

import hand.service.IAnnotationService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class AnnotationController {
     private IAnnotationService annotationService;

     @Resource
     public  void setAnnotationService(IAnnotationService annotationService){
         this.annotationService=annotationService;
     }

       public void addUser(){
           System.out.println("准备添加新用户");
       }
}
