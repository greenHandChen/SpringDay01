package com.hand.test;

import com.hand.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTransaction {
    @Test
    public void testTransaction() {
        String source = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(source);
        AccountService accountService = applicationContext.getBean(AccountService.class);
        accountService.transfer("mybatis", "hibernate", 100.0);
    }
}
