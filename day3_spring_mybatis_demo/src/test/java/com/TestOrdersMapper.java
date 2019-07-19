package com;

import com.mapper.OrderMapper;
import com.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 22:42 2019/7/19
 * @Modified By:
 */
public class TestOrdersMapper {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        OrderMapper orderMapper = applicationContext.getBean("orderMapper", OrderMapper.class);
        System.out.println(orderMapper.findOrdersById(3));
    }
}
