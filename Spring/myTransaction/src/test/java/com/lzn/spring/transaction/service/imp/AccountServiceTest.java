package com.lzn.spring.transaction.service.imp;

import com.lzn.spring.transaction.dao.imp.AccountDao;
import com.lzn.spring.transaction.service.IAccountService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class AccountServiceTest {

    private ApplicationContext applicationContext = null;
    private AccountService accountService = null;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("mySpring.xml");
        accountService = (AccountService) applicationContext.getBean("accountService");
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * @Description 测试事务
     * @Param
     * @Return
     * @Author LinZhenNan
     * @Date 2019/7/17
     * @Time 21:25
     */
    @Test
    public void transfer() {
        accountService.transfer("mybatis", "hibernate", 200d);


    }
}