package com.xyh.Transaction;

import com.xyh.Transaction.Service.AccountService;
import com.xyh.Transaction.Service.AccountServiceInter;
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
        AccountServiceInter accountServiceInter=applicationContext.getBean("accountServiceProxy", AccountServiceInter.class);
        accountServiceInter.transaction("hibernate","mybatis", BigDecimal.valueOf(100));
    }
}
