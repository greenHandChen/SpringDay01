package Client;

import Service.IAnnotationService;
import SpringTest.*;
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
        System.out.println("--------------");

        HelloSpring hs=(HelloSpring) ac.getBean("helloSpring");
        hs.initBean();
        hs.destoryBean();
        System.out.println("--------------");

        MyBeanPostProcessor mb=(MyBeanPostProcessor) ac.getBean("myBeanPostProcessor");
        mb.postProcessAfterInitialization(t,"1");
        mb.postProcessBeforeInitialization(t,"2");
        System.out.println("--------------");

        Person p=(Person) ac.getBean("person");
        System.out.println(p.toString());
        System.out.println("--------------");

        CollectionBean cb=ac.getBean("collectionBean",CollectionBean.class);
        System.out.println(cb.toString());
    }
}
