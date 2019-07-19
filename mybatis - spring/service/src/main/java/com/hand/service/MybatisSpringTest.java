package com.hand.service;

import com.hand.VO.UserQueryVO;
import com.hand.ext.OrdersExt;
import com.hand.mapper.OrdersMapper;
import com.hand.mapper.UserMapper;
import com.hand.pojo.Orders;
import com.hand.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;


public class MybatisSpringTest {
    private static ApplicationContext applicationContext;


    static {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }


    @Test
    public void test() {
        UserMapper mapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = mapper.findUserById(1);
        System.out.println(user);

        user.setId(29229);
        mapper.addUserByUUID(user);
        List<User> users = mapper.showUsers();
        System.out.println(users);
    }
    @Test
    public void testMapper(){
        OrdersMapper mapper = (OrdersMapper) applicationContext.getBean("ordersMapper");
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.setId(5);
        OrdersExt ordersExt1 = mapper.findOrdersExt(ordersExt);
        System.out.println(ordersExt1);
    }
}
