package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationSpring{
    public  static  void main(String[] orgs){

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        MessagePrinter printer= context.getBean(MessagePrinter.class);
        printer.printMessage();

    }
}