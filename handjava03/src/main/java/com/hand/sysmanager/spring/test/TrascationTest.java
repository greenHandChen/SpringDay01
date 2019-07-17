package com.hand.sysmanager.spring.test;

import com.hand.sysmanager.spring.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/17 15:02
 */
public class TrascationTest {

    @Test
    public void testDemo()
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountService = (IAccountService) applicationContext.getBean("acountServiceImpl");
        accountService.transfer("mybatis","hibernate", BigDecimal.valueOf(10));

    }
}
