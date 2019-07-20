package com.exam.mapper;

import com.exam.entity.OrderExt;
import com.exam.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserMapperTest {

    @Test
    public void testFindUserById() {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        OrderMapper orderMapper = (OrderMapper)ctx.getBean("orderMapper");

        System.out.println("---------- 查找订单信息，订单详情及其用户信息 ----------");
        List<OrderExt> orderExtList = orderMapper.findDrderAndOrderDetail();

        for(int i = 0; i < orderExtList.size(); i++) {

            System.out.println(orderExtList.get(i));

        }
    }
}
