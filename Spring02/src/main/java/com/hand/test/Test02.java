package com.hand.test;

import com.hand.bean.BeanFactory;
import com.hand.bean.Student;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

    ApplicationContext context;
    @Before
    public void setUp(){
        String resource = "applicationContext.xml";
        context = new ClassPathXmlApplicationContext(resource);
    }

    @Test
    public void test01(){

        Student stu1 = context.getBean("myStudent", Student.class);
        System.out.println(stu1);

        ((ClassPathXmlApplicationContext)context).close();
    }

    //通过动态工厂bean获取bean
    @Test
    public void test02(){
        BeanFactory factory = context.getBean("factory", BeanFactory.class);
        Student student = factory.getStudent();
        Student student1 = context.getBean("student1",Student.class);
        System.out.println(student);
        System.out.println(student1);
    }

    //通过静态工厂bean获取bean
    @Test
    public void test03(){
        Student student2 = context.getBean("student2", Student.class);
        System.out.println(student2);
    }


}
