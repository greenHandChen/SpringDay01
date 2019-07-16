package com.hand.test;

import com.hand.bean.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

    @Test
    public void test01(){
        String resource = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(resource);

        Student stu1 = context.getBean("myStudent", Student.class);
        System.out.println(stu1);

        ((ClassPathXmlApplicationContext)context).close();
    }
}
