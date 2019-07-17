package com.hand.service;

import com.hand.dao.AccountDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

public class SpringTx {
    private static ApplicationContext applicationContext=null;
    static {
        applicationContext=new ClassPathXmlApplicationContext("application.xml");
    }
    @Test
    public  void test2(){
        test();
    }

    @Transactional(rollbackFor = Exception.class)
    public void test(){
        AccountDao accountDao=(AccountDao) applicationContext.getBean("accountDao");
        accountDao.in("mybatis",100);
        int a=1/0;
        accountDao.out("hibernate",100);
    }
}
