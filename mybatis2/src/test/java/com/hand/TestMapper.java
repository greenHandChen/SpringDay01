package com.hand;

import com.hand.dao.OrderDetailMapper;
import com.hand.dao.OrderMapper;
import com.hand.dao.UserMapper;
import com.hand.domain.Orders;
import com.hand.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.annotation.Order;

import java.io.IOException;
import java.io.InputStream;

public class TestMapper {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }
    @Test
    public void testFinOrdersAndOrderDetail(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderDetailMapper orderDetailMapper =sqlSession.getMapper(OrderDetailMapper.class);
        System.out.println(orderDetailMapper.findOrdersAndOrderDetails(3).toString());

    }
    @Test
    public void testFindOrderInfoByLazyLoad(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper =sqlSession.getMapper(OrderMapper.class);
        System.out.println(orderMapper.findOrderInfoByLazyLoad(3).getId());
    }
    @Test
    public void testFirstCache(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.findUserById(1);
        userMapper.findUserById(1);
    }
    @Test
    public void testFirstCache02(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("11");
        userMapper.findUserById(1);
        userMapper.addUser(user);
        userMapper.findUserById(1);
    }
    @Test
    public void testSecCache(){
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();
        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
        userMapper1.findUserById(1);
        sqlSession1.close();
        userMapper2.findUserById(1);
        sqlSession2.close();

    }
    @Test
    public void testSecCache2(){
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();
        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("sss");
        userMapper1.findUserById(1);
        sqlSession1.close();
        userMapper3.addUser(user);
        sqlSession3.close();
        userMapper2.findUserById(1);
        sqlSession2.close();

    }
}
