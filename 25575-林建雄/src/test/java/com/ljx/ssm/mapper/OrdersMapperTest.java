package com.ljx.ssm.mapper;

import com.ljx.ssm.po.OrdersExt;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author LinJianXiong
 * @Date 2019/7/20
 * @Time 15:47
 */
public class OrdersMapperTest {

    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext(
                "config/spring/applicationContext-mapper.xml");
    }

    @Test
    public void findUserByIdTest() throws Exception {
        // 创建UserDao
        OrdersMapper ordersMapper = (OrdersMapper) ctx.getBean("ordersMapper");

        List<OrdersExt> ordersExts = ordersMapper.findOrdersExts();

        System.out.println(ordersExts);
    }
}