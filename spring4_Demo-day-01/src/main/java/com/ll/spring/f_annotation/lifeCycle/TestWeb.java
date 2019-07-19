package com.ll.spring.f_annotation.lifeCycle;

import com.ll.spring.f_annotation.web.repository.IAnnotationRepositoryImpl;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestWeb {

    @Test
    public void demo(){
        AbstractApplicationContext context = new FileSystemXmlApplicationContext("D:\\IDEAWorkSpace\\SpringDay01\\spring4_Demo\\src\\main\\java\\com\\ll\\spring\\f_annotation\\lifeCycle\\beans.xml");

        Person person1 = context.getBean("person",Person.class);
        Person person2 = context.getBean("person",Person.class);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

    }
}
