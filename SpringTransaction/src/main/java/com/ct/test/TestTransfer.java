package com.ct.test;

import com.ct.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTransfer {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IAccountService accountService = (IAccountService) applicationContext.getBean("accountService");
        accountService.transfer("hibernate", "mybatis", 100D);
    }
}
