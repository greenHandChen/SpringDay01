package com.spring;

import com.spring.service.AccountServiceImpl2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 16:01 2019/7/17
 * @Modified By:
 */
public class TestAccount {

    @Test
    public void test()
{
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        AccountServiceImpl2 accountService= (AccountServiceImpl2) applicationContext.getBean("accountService");

        accountService.transfer("dragon","yangzi",100.00);
        }
        }