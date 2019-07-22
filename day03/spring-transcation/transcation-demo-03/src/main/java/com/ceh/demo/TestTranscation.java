package com.ceh.demo;

import com.ceh.demo.service.AccountServiceImpl;
import com.ceh.demo.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * Created by enHui.Chen on 2019/7/17.
 */
public class TestTranscation {
    @Test
    public void testDemo() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountService accountServiceImpl = applicationContext.getBean("accountProxyService", IAccountService.class);
        accountServiceImpl.transfer("hibernate", "mybatis", BigDecimal.valueOf(100));
    }
}
