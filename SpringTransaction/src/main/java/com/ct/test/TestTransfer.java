package com.ct.test;

import com.ct.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTransfer {
    public static void main(String[] args) {
        //声明式：AOP配置事务基于注解
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IAccountService accountService = (IAccountService) applicationContext.getBean("accountService");
        accountService.transfer("hibernate", "mybatis", 100D);

        //编程式事务管理
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IAccountService accountService = (IAccountService) applicationContext.getBean("accountService");
        accountService.transfer1("hibernate", "mybatis", 100D);*/

        //声明式：原始方式
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IAccountService accountService = applicationContext.getBean("accountServiceProxy", IAccountService.class);
        accountService.transfer2("hibernate", "mybatis", 100D);*/
    }
}
