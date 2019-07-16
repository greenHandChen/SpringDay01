package club.osai.spring03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationControllerTest {

    @Test
    public void add() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("club/osai/spring03/beans.xml");
        AnnotationController annotationController = applicationContext.getBean("annotationController", AnnotationController.class);
        annotationController.add();

    }
}