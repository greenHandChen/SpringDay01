package com.hand.service;

import com.hand.mapper.OrderMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisTest {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderMapper mapper=(OrderMapper)applicationContext.getBean("ordermapper");
        mapper.findOrdersExts(new com.hand.Ext.OrdersExt());
    }
}
