package spring_demo2.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_demo2.controller.AnnotationController;

public class DI_demo {

    @Test
    public void di_demo(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("helloSpring1.xml");
        AnnotationController annotationController = (AnnotationController) applicationContext.getBean("annotationController");
        annotationController.addUser();
    }
}
