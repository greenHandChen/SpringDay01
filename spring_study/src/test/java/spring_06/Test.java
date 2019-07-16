package spring_06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring_05.Person;

public class Test {
    @org.junit.Test
    public void comScan(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring_06/spring.xml");

        AnnotationController annotationController= (AnnotationController) applicationContext.getBean("annotationController");

        annotationController.addUser();
    }
}
