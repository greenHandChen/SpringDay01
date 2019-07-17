package com.hand.UserTest;

import com.hand.UserDaoImpl.AccountDaoImpl;
import com.hand.UserService.IAccountService;
import com.hand.UserServiceImpl.AccountServiceImpl;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void testUser1(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDaoImpl accountDaoImpl=applicationContext.getBean("accountDao", AccountDaoImpl.class);
        accountDaoImpl.in("hibernate",  500d);
        accountDaoImpl.out("mybatis",500d);
    }
    @Test
    public void transferTest(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountServiceImpl=applicationContext.getBean("accountService", IAccountService.class);
        accountServiceImpl.transfer("mybatis","hibernate",1000D);
    }

}
