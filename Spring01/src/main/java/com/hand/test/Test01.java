package com.hand.test;

import com.hand.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void test01(){
        String resource = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(resource);

        Student stu1 = context.getBean("myStudent", Student.class);
        System.out.println(stu1);

        //在scope为singleton下，两个student对象的引用地址是相等的，默认为singleton模式
        //在scpoe为prototype下，两个student对象的引用地址不同
        Student stu2 = context.getBean("myStudent", Student.class);
        System.out.println(stu1.toSuperString());
        System.out.println(stu2.toSuperString());
    }
}