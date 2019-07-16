package Client;

import Service.IAnnotationService;
import SpringTest.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        test t=(test) ac.getBean("test");
        t.setId(25580);
        t.setName("Yanghongkun");
        System.out.println(t.getName());
        System.out.println(t.getId());
        System.out.println("--------------");
        IAnnotationService as=(IAnnotationService) ac.getBean("annotationServiceImpl");
        as.addUser();
    }
}
