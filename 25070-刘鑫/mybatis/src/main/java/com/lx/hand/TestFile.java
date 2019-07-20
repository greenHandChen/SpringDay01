package com.lx.hand;

import com.lx.hand.domain.OrdersExt;
import com.lx.hand.mapper.OrdersExtMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFile {
    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        OrdersExtMapper extMapper = (OrdersExtMapper)applicationContext.getBean("ordersExtMapper");
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setNumber(1000010);
        System.out.println(extMapper.findOrdersExts(ordersExt));
    }
}
