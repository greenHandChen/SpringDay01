package com.wpb.test;

import com.wpb.service.IAccountService;
import com.wpb.service.impl.AccountServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    private IAccountService accountService;

    public void setUp(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        accountService = context.getBean("accountService", AccountServiceImpl.class);
        accountService = context.getBean("accountService", IAccountService.class);
//        accountService = (AccountServiceImpl)context.getBean("accountServiceProxy");
        System.out.println("IAccountService");
    }

    @Test
    public void test01(){
        accountService.transfer("mybatis","hibernate",100d);
    }

    @Test
    public void test02(){
        accountService.transfer2("mybatis","hibernate",100d);
    }

    @Test
    public void test03(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        accountService = (IAccountService)ac.getBean("accountServiceProxy");
        accountService.transfer3("mybatis","hibernate",110d);
    }

    //注解
    @Test
    public void test04(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        accountService = ac.getBean("accountService",IAccountService.class);
        accountService.transfer4("mybatis","hibernate",30d);
    }
}
