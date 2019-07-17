package com.hsl.transactionTemplate.demo1;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DemoTest {



        @Test
        public void demo1(){

            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
            AccountService accountService = applicationContext.getBean(AccountService.class);
            accountService.ChangeMoney("hsl", "qwe", 2000d);
        }

}
