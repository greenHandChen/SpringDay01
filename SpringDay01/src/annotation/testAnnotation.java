package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation/SpringContext.xml");
//        IController controller = (IController) applicationContext.getBean("controller");
        IController controller = (IController) applicationContext.getBean("IController");
        controller.addUser();
    }
}
