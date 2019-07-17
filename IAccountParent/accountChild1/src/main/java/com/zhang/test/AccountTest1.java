package com.zhang.test;

import com.zhang.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:AccountTest1
 * Author:ZhangChunjia
 * Date:2019/7/17 21:35
 */
public class AccountTest1 {

    @Test
    public void transferTest1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("conf/applicationContext-1.xml");
        IAccountService iAccountService=applicationContext.getBean("iAccountServiceProxy",IAccountService.class);
        iAccountService.transfer("mybatis","hibernate",1000D);
    }
}
