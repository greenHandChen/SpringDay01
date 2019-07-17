package com.zd;

import static org.junit.Assert.assertTrue;

import com.zd.Service.AccountServiceImpl;
import com.zd.Service.IAccountService;
import com.zd.dao.AccountDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void transfer(){
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("application.xml");
        AccountServiceImpl dao = (AccountServiceImpl)applicationContext.getBean("accountDao");
        dao.transfer("spring","mybatis",1000.23);

    }
}
