package com.ceh.spring.a_ioc;

import com.ceh.spring.b_di.DISpring;
import com.ceh.spring.b_di.HelloSpring;
import com.ceh.spring.entity.CollectionBean;
import com.ceh.spring.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HuangHeng on 2019/7/16
 */
public class TestSpring {
    @Test
    public void before(){
        HelloSpring helloSpring=new HelloSpring();
        helloSpring.setInfo("萨瓦迪卡");
        System.out.println(helloSpring.getInfo());
    }

    @Test
    public void now(){
        ApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("spring-context.xml");
        HelloSpring helloSpring =(HelloSpring) applicationContext.getBean("helloSpring");
        helloSpring.setInfo("see you lala");
        System.out.println(helloSpring.getInfo());
    }
    @Test
    public void beforeOne(){
        HelloSpring helloSpring=new HelloSpring();
        DISpring diSpring=new DISpring();
        helloSpring.setDiSpring(diSpring);
        System.out.println(helloSpring.getDiSpring());
    }
    @Test
    public void nowOne(){
        AbstractApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("spring-context.xml");
        HelloSpring helloSpring =(HelloSpring) applicationContext.getBean("helloSpring");
        System.out.println(helloSpring);
        applicationContext.close();
    }
    @Test
    public void person(){
        AbstractApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("spring-context.xml");
        Person person=(Person) applicationContext.getBean("person");
        System.out.println(person);
    }
    @Test
    public void getList(){
        AbstractApplicationContext applicationContext
                =new ClassPathXmlApplicationContext("spring-context.xml");
        CollectionBean collectionBean=(CollectionBean) applicationContext.getBean("string");
        System.out.println(collectionBean);
    }
}
