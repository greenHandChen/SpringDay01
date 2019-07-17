package com.spring.trancation.test;

import com.spring.trancation.Service.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
      public static void main(String args[]){
          ApplicationContext cxt=new ClassPathXmlApplicationContext("application.xml");
          AccountServiceImpl accountServiceImpl=(AccountServiceImpl)cxt.getBean("accountServiceImpl");
          accountServiceImpl.tranfer("ESB","jmx",200.00);


      }
}
