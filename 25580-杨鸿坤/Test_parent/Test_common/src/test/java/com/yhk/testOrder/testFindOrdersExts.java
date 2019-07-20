package com.yhk.testOrder;

import com.yhk.mapper.OrdersMapper;
import com.yhk.pojo.OrdersExt;
import com.yhk.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testFindOrdersExts {

    private ApplicationContext ac;

    @Before
    public void init(){
        ac=new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
    }
    @Test
    public void testFindUserById(){
        OrdersMapper ordersMapper = ac.getBean("ordersMapper", OrdersMapper.class);
        OrdersExt ordersExt = ac.getBean("ordersExt", OrdersExt.class);
        ordersExt.setNumber("1000010");
//        ordersExt.setName("汉德产品");

        System.out.println(ordersMapper.findOrdersExts(ordersExt));
    }
}
