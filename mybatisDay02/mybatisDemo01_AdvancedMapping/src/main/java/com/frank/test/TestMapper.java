package com.frank.test;

import com.frank.mapper.UserMapper;
import com.frank.pojo.Order;
import com.frank.pojo.OrderUser;
import com.frank.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class TestMapper {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private UserMapper mapper;
    /**
     * 初始化信息
     * @throws IOException
     */
    @Before
    public void init() throws IOException {
        //加载文件流
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //创建openSession对象
        sqlSession = sqlSessionFactory.openSession();
        //创建userMapper对象
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    /**
     * 关闭资源
     */
    @After
    public void destroy(){
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 测试resultType实现一对一关联查询
     */
    @Test
    public void test01() {
        //OrderUser对象为空就默认查找全部的数据,添加一个id则按id查找单条用户信息
        OrderUser orderUser = new OrderUser();
        List<OrderUser> list = mapper.findOrdersAndUser(orderUser);
        for (OrderUser user : list) {
            System.out.println(user);
        }
    }

    /**
     * 测试resultMap实现一对一关联查询
     */
    @Test
    public void test02() {
        //OrderUser对象为空就默认查找全部的数据,添加一个id则按id查找单条用户信息
        Order order = new Order();
        order.setId(3);
        List<Order> list = mapper.findOrdersAndUserByResultMap(order);
        for (Order order1 : list) {
            System.out.println(order1);
        }
    }/**
     * 测试resultMap实现一对多关联查询
     */
    @Test
    public void test03() {
        //OrderUser对象为空就默认查找全部的数据,添加一个id则按id查找单条用户信息
        Order order = new Order();
        List<Order> list = mapper.ordersAndOrderDetailsResultMap(order);
        for (Order order1 : list) {
            System.out.println(order1);
        }
    }


}
