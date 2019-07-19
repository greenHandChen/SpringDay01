package com.lzn.spring.dao;

import com.lzn.spring.entity.OrdersExt;
import com.lzn.spring.entity.UserEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class OrderMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("config/SqlMapConfig.xml"));

    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * @Description 查询 OrdersExt
     * @Author LinZhenNan
     * @Date 2019/7/19
     * @Time 11:16
     */
    @Test
    public void findOrdersExt() {
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(new Integer(1));

        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrdersExt> list = orderMapper.findOrdersExt(ordersExt);
        sqlSession.close();
        System.out.println(list);

        System.out.println("findOrdersExt() end");
    }

    /**
     * @Description 基于resultmap查询
     * @Author LinZhenNan
     * @Date 2019/7/19
     * @Time 11:16
     */
    @Test
    public void findOrdersByResultMap() {
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(new Integer(1));

        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrdersExt> list = orderMapper.findOrdersByResultMap(ordersExt);
        sqlSession.close();
        System.out.println(list);

        System.out.println("findOrdersByResultMap() end");
    }

    @Test
    public void findOrdersAndOrderDetail() {
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(new Integer(3));

        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrdersExt> list = orderMapper.findOrdersAndOrderDetail(ordersExt);
        sqlSession.close();
        System.out.println(list);

        System.out.println("findOrdersAndOrderDetail() end");
    }

    /**
     * @Description 使用来加载查询
     * @Author LinZhenNan
     * @Date 2019/7/19
     * @Time 15:31
     */
    @Test
    public void findOrderInfoByLazyLoad() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrdersExt> list = orderMapper.findOrderInfoByLazyLoad(new Integer(4));
        list.get(0).getUser();
        sqlSession.close();
        System.out.println(list);

        System.out.println("findOrderInfoByLazyLoad() end");
    }

    /**
     * @Description 测试一级缓存,第二次查询缓存
     * @Author LinZhenNan
     * @Date 2019/7/19
     * @Time 15:42
     */
    @Test
    public void testFirstCacheDemo01() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 第一次查询
        userMapper.findUserById(new Integer(1));

        // 第二次不走数据库
        userMapper.findUserById(new Integer(1));

        sqlSession.close();

        System.out.println("testFirstCacheDemo01() end");
    }

    /**
     * @Description 第二次查询查数据库
     * @Author LinZhenNan
     * @Date 2019/7/19
     * @Time 15:52
     */
    @Test
    public void testFirstCacheDemo02() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);


        userMapper.findUserById(new Integer(1));

        UserEntity user = new UserEntity();
        user.setUsername("lazyTest");
        userMapper.addUser(user);

        userMapper.findUserById(new Integer(1));

        sqlSession.close();

        System.out.println("testFirstCacheDemo02() end");
    }

    /**
     * @Description 测试二级缓存
     * @Author LinZhenNan
     * @Date 2019/7/19
     * @Time 16:00
     */
    @Test
    public void testSecondCacheDemo01() {
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();

        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);

        userMapper1.findUserById(new Integer(1));
        sqlSession1.close();
        userMapper2.findUserById(new Integer(1));
        sqlSession2.close();

        System.out.println("testSecondCacheDemo01() end");
    }

    @Test
    public void testSecondCacheDemo02() {
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();

        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);

        userMapper1.findUserById(new Integer(1));
        sqlSession1.close();

        UserEntity user = new UserEntity();
        user.setUsername("secondCacheTest");
        userMapper3.addUser(user);
        // 清空二级缓存
        sqlSession3.commit();
        sqlSession3.close();

        userMapper2.findUserById(new Integer(1));
        sqlSession2.close();

        System.out.println("testSecondCacheDemo01() end");
    }
}