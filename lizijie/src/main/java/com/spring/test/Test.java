

import com.spring.cn.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void now(){
        ApplicationContext appCon=new ClassPathXmlApplicationContext("beans.xml");
        HelloSpring hellospring= (HelloSpring) appCon.getBean("helloSpring");
        hellospring.setInfo("111");
        System.out.println(hellospring.getInfo());
        HelloSpring hellospring2= (HelloSpring) appCon.getBean("helloSpring");
        DiSpring di=new DiSpring();
        di.setDI("222");
        hellospring2.setDI(di);
        System.out.println(hellospring2.getDi().toString());
    }
    @org.junit.Test
    public void constructor(){
        ApplicationContext appCon=new ClassPathXmlApplicationContext("beans.xml");
        Person person=(Person)appCon.getBean("person");
        System.out.println(person);
    }
    @org.junit.Test
    public void setter(){
        ApplicationContext appCon=new ClassPathXmlApplicationContext("beans.xml");
        Person02 person02=(Person02)appCon.getBean("person02");
        System.out.println(person02);
    }
    @org.junit.Test
    public void collection(){
        ApplicationContext appCon=new ClassPathXmlApplicationContext("beans.xml");
        CollectionBean collectionBean=(CollectionBean)appCon.getBean("collectionBean");
        System.out.println(collectionBean);
    }
}
