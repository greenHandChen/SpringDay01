package com.Test;

import com.Dao.AccountDaoImpl;
import com.Service.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class TransactionTest {

    @Test
    public void demo(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationConfig.xml");
        AccountServiceImpl accountService= (AccountServiceImpl) applicationContext.getBean("accountServiceImpl");

        accountService.transfer("mybatis","hibernate",100);
    }
}
