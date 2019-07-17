package com.hand.web;

import com.hand.service.AccountServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by HuangHeng on 2019/7/17
 */
public class TestWeb {
    @Autowired
    private AccountServiceImpl accountServiceImpl;

    @Test
    public void testDemo(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        AccountServiceImpl accountServiceImpl = ctx.getBean("accountServiceImpl", AccountServiceImpl.class);
        accountServiceImpl.transfer("mybatis","hibernate",100);
    }
}
