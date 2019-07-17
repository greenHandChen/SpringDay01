package com.xyh.Transaction;

import com.xyh.Transaction.Service.AccountService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class AccountServiceTest {

    private ApplicationContext applicationContext;

    @Before
    public void init(){
        applicationContext = new ClassPathXmlApplicationContext("spring_tx.xml");
    }

    @Test
    public void demo(){
        AccountService accountService=applicationContext.getBean("accountService", AccountService.class);
        accountService.transaction("hibernate","mybatis", BigDecimal.valueOf(100));
    }
}
