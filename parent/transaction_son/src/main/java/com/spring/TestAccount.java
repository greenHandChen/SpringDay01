package com.spring;

import com.spring.dao.IAccountDao;
import com.spring.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 16:01 2019/7/17
 * @Modified By:
 */
public class TestAccount {

    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        IAccountService accountService= (IAccountService) applicationContext.getBean("accountService");

        accountService.transfer("dragon","yangzi",100.00);
    }
}
