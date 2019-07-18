package com.hand;

import com.hand.service.AccountService;
import com.hand.service.impl.AccountServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class AppTest 
{
    ApplicationContext ac;
    AccountService as;
    @Before
    public void init(){
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        as = ac.getBean("accountServiceImpl", AccountServiceImpl.class);
    }

    /**
     * 声明式事务：基于注解
     */
    @Test
    public void testTransaction(){
        as.transfer("62345687","24573457",new BigDecimal(500));
    }

    @Test
    public void testPropagation(){
        as.makeMoney("62345687",new BigDecimal(500));
    }

}
