package MavenTest.spring.g_annotation;

import MavenTest.spring.g_annotation.Controller.AnnotationController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;

public class TestSpring {

    @Test
    public void now(){
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("E:\\IdeaProjects\\MavenTest\\src\\main\\java\\MavenTest\\spring\\g_annotation\\application.xml");
        AnnotationController annotationController= (AnnotationController) applicationContext.getBean("controller");
        annotationController.addUser();
    }
}
