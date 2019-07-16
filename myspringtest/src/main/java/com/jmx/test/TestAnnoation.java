package com.jmx.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnoation {
       public void test(){
           ApplicationContext ctx=new ClassPathXmlApplicationContext("spring_test.xml");
           Zoo zoo=(Zoo)ctx.getBean("zoo");
           System.out.println(zoo.toString());
           CarFactory carFactory=(CarFactory)ctx.getBean("carFactory");
           System.out.println(carFactory.toString());
       }
       public static void main(String args[]){
            TestAnnoation ta=new TestAnnoation();
             ta.test();

       }
}

