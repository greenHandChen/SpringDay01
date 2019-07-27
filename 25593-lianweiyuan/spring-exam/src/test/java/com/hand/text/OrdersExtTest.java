package com.hand.text;

import com.hand.entity.OrderExt;
import com.hand.mapper.OrdersMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/20 16:01
 */
public class OrdersExtTest {

    @Autowired
    private OrdersMapper ordersMapper;

    @Test
    public void test() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrdersMapper ordersMapper = (OrdersMapper) applicationContext.getBean("ordersMapper");
        OrderExt orderExt = new OrderExt();
        List<OrderExt> orderExtList = ordersMapper.findOrdersExts(orderExt);
        System.out.println(orderExtList);
    }

}
