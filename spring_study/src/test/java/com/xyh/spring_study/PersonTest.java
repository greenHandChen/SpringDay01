package com.xyh.spring_study;

import com.xyh.spring_studay.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class PersonTest {

    @Test
    public void set()
    {
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext("D:\\workspace\\spring_study\\src\\main\\java\\com\\xyh\\spring_studay\\beans.xml");
        Person person1=applicationContext.getBean("person1",Person.class);
        System.out.println("构造函数赋值："+person1.toString());
        Person person2=applicationContext.getBean("person2",Person.class);
        System.out.println("set函数赋值："+person2.toString());
    }
}
