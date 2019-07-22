package com.ceh.demo;

import com.ceh.demo.service.AccountServiceImpl;
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
        AccountServiceImpl accountServiceImpl = applicationContext.getBean("accountServiceImpl", AccountServiceImpl.class);
        accountServiceImpl.transfer("hibernate", "mybatis", BigDecimal.valueOf(100));
    }
}
