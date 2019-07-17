package com.ll.demo.test;

import com.ll.demo.service.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testDemo(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountServiceImpl accountServiceImpl = ctx.getBean("accountServiceImpl", AccountServiceImpl.class);
        accountServiceImpl.transfor("mybatis","hibernate",100);
    }

}
