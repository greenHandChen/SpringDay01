package com.ceh.mybatis;

import com.ceh.mybatis.domain.OrdersExt;
import com.ceh.mybatis.domain.User;
import com.ceh.mybatis.mapper.OrderMapper;
import com.ceh.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by enHui.Chen on 2019/7/9.
 */
public class TestMybatis02 {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findOrdersExt() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        OrdersExt ordersExt = new OrdersExt();

        ordersExt.setId(5);

        List<OrdersExt> ordersExt1 = orderMapper.findOrdersExt(ordersExt);

        sqlSession.close();
    }

    @Test
    public void ordersAndUserRstMap() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        OrdersExt ordersExt = new OrdersExt();

        ordersExt.setId(4);

        List<OrdersExt> ordersExt1 = orderMapper.findOrdersByResultMap(ordersExt);

        sqlSession.close();
    }

    @Test
    public void findOrdersAndOrderDetail() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        OrdersExt ordersExt = new OrdersExt();

        ordersExt.setId(4);

        List<OrdersExt> ordersExt1 = orderMapper.findOrdersAndOrderDetail(ordersExt);

        sqlSession.close();
    }

    @Test
    public void findOrderInfoByLazyLoad() {
         
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        List<OrdersExt> ordersExt1 = orderMapper.findOrderInfoByLazyLoad(4);

//        // 当积极懒加载为true时,使用OrdersExt的任意属性就会触发用户查询的懒加载;为false时，不会出发用户查询的懒加载
//        ordersExt1.get(0).getUsername();
//        // 当积极加载为false时,使用懒属性才出发用户查询进行懒加载
        ordersExt1.get(0).getUser();
        sqlSession.close();
    }

    @Test
    public void testFirstCacheDemo01() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 两次查询第二次不走数据库
        userMapper.findUserById(1);

        userMapper.findUserById(1);

        sqlSession.close();
    }

    @Test
    public void testFirstCacheDemo02() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        userMapper.findUserById(1);

        User user = new User();
        user.setUsername("缓存测试");
        userMapper.addUser(user);
        sqlSession.commit();
        userMapper.findUserById(1);

        sqlSession.close();
    }

    @Test
    public void testSecondCacheDemo01() {
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();

        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);

        userMapper1.findUserById(1);
        sqlSession1.close();
        userMapper2.findUserById(1);
        sqlSession2.close();
    }

    @Test
    public void testSecondCacheDemo02() {
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();

        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);

        userMapper1.findUserById(1);
        sqlSession1.close();

        User user = new User();
        user.setUsername("二级缓存测试");
        userMapper3.addUser(user);
        // 清空二级缓存
        sqlSession3.commit();
        sqlSession3.close();

        userMapper2.findUserById(1);
        sqlSession2.close();
    }
}
