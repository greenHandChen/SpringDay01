package com.transaction;

import com.transaction.dao.IAccountDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/transconfigure/applicationContext.xml");
        IAccountDao accountDao = (IAccountDao) context.getBean("accountDao");
        accountDao.out("mybatis",Double.valueOf(100));
        System.out.println("转账成功120元。");
        accountDao.in("hibernate",Double.valueOf(100));
    }
}
