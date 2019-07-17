package com.ll.demo.test;

import com.ll.demo.service.AccountServiceImpl;
import com.ll.demo.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void testDemo(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IAccountService accountService = ctx.getBean("accountServiceProxy", IAccountService.class);
        accountService.transfor("mybatis","hibernate",100);
    }

}
