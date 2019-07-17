package com.lx.springtest;

import com.lx.springtest.Dao.Impl.AccountDaoImpl;
import com.lx.springtest.Service.IAccountService;
import com.lx.springtest.Service.Impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class test {

    @Test
    public void afternoon(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //需要目标类的接口类型
        IAccountService accountService = (AccountServiceImpl)applicationContext.getBean("accountServiceImpl");
        accountService.transfer("张三","李四", Double.valueOf(50));
    }
}
