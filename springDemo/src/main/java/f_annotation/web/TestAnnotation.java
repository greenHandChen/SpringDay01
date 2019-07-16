package f_annotation.web;

import f_annotation.web.controller.AnnotationController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAnnotation {
    @Test
    public void test(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\codeSofe\\coding\\IdeaProjects\\springDay01\\springDemo\\src\\main\\java\\f_annotation\\web\\applicationContext.xml");
        AnnotationController annotationController = (AnnotationController) applicationContext.getBean("annotationController");
        annotationController.addUser();
    }

}
