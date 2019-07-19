package com.hand.smybatis.junit;

import com.hand.smybatis.dao.UserDao;
import com.hand.smybatis.mapper.OrderMapper;
import com.hand.smybatis.mapper.UserMapper;
import com.hand.smybatis.pojo.Order;
import com.hand.smybatis.pojo.User;
import com.hand.smybatis.service.UserMapperService;
import com.hand.smybatis.service.UserMapperServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

@Component
public class UserDaoTest {


    @Test
    public void testQueryUserById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = ac.getBean(UserDao.class);
        UserMapper userDao = (UserMapper) ac.getBean("userMapper");
        User user = userDao.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void testUserMapper() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = ac.getBean(UserMapper.class);
//		UserMapper mapper = (UserMapper) ac.getBean("UserMapper");
        User user = mapper.findUserById(10);
        System.out.println(user);
    }

    @Test
    public void UserByOrderTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = ac.getBean(UserMapper.class);
//		UserMapper mapper = (UserMapper) ac.getBean("UserMapper");
        List<User> user = mapper.selectUserAndOrderById();
        for (User u : user
        ) {
            System.out.println(u);
        }

    }

    @Test
    public void selectOrderListTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderMapper mapper = ac.getBean(OrderMapper.class);
//		UserMapper mapper = (UserMapper) ac.getBean("UserMapper");
        List<Order> Orders = mapper.selectOrderList();
        for (Order o : Orders
        ) {
            System.out.println(o);
        }

    }

    @Test
    public void selectOrderByUserIdTest() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderMapper mapper = ac.getBean(OrderMapper.class);
//		UserMapper mapper = (UserMapper) ac.getBean("UserMapper");
        List<Order> Orders = mapper.selectOrderByUserId();
        for (Order o : Orders
        ) {
            System.out.println(o);
        }

    }
//    @Before

    //
//    @Autowired
//    private UserMapperServiceImpl userMapperService ;
    @Test
    public void UserByIdTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperServiceImpl userDAO = (UserMapperServiceImpl) applicationContext.getBean("userMapperServiceImpl");
//        UserMapperService userMapperService = new UserMapperServiceImpl();
        User user = userDAO.findUserById(10);
        System.out.println(user);

    }


    @Test
    public void selectMoreByMoreTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperServiceImpl userDAO = (UserMapperServiceImpl) applicationContext.getBean("userMapperServiceImpl");
//        UserMapperService userMapperService = new UserMapperServiceImpl();
        List<User> user = userDAO.selectMoreByMore();

        for (User u : user
             ) {
            System.out.println(user.size());

        }

    }

}
