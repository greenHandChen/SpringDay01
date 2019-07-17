package com.yts.test;


import com.yts.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TranTest {

    @Test
    public void transfer1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = applicationContext.getBean("accountServiceImpl",IAccountService.class);
        accountService.transfer("hibernate","mybatis",100.00);
    }

    @Test
    public void transfer2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = applicationContext.getBean("accountServiceProxy",IAccountService.class);
        accountService.transfer("hibernate","mybatis",100.00);
    }

}
