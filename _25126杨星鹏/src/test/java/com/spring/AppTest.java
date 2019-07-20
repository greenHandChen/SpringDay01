package com.spring;

import static org.junit.Assert.assertTrue;

import com.spring.domain.OrdersExt;
import com.spring.mapper.OrdersMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testUserMapperImpl() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext");
        OrdersMapper ordersMapper = applicationContext.getBean("ordersMapper", OrdersMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        System.out.println(ordersMapper.findOrdersExts(ordersExt));
    }
}
