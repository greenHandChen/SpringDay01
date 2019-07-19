package com.yhk.TestMybatis;

import com.yhk.Mapper.OrdersMapper;
import com.yhk.Mapper.UserMapper;
import com.yhk.Pojo.Orderdetail;
import com.yhk.Pojo.OrdersExt;
import com.yhk.Pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test01 {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    /**
     * 根据订单Id查询订单以及用户信息
     */
    @Test
    public void findOrdersExt(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.setId(3);
        List<OrdersExt> ordersExt1 = mapper.findOrdersExt(ordersExt);
        System.out.println(ordersExt1.toString());
        sqlSession.close();
    }

    /**
     * 使用Map映射 一对一
     */
    @Test
    public void findOrdersAndUserRstMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        OrdersExt ordersExt=new OrdersExt();
        ordersExt.setId(3);
        List<OrdersExt> ordersExt1 = mapper.findOrdersAndUserRstMap(ordersExt);
        System.out.println(ordersExt1.toString());
        sqlSession.close();
    }

    /**
     *  一对多
     */
    @Test
    public void findOrdersAndDetailRetMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        OrdersExt ordersExt = new OrdersExt();
        ordersExt.setId(3);
        List<Orderdetail> detail = mapper.findOrdersAndDetailRetMap(ordersExt);
        System.out.println(detail.toString());
        sqlSession.close();
    }
    
    @Test
    public void findUserAndItemsRstMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<User> itemslist = mapper.findUserAndItemsRstMap();
        System.out.println(itemslist);
        sqlSession.close();
    }
    @Test
    public void testLazyLoading(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<OrdersExt> lazyLoad = mapper.findOrderInfoByLazyLoad(4);
        System.out.println(lazyLoad.get(0).getUsername());
        System.out.println(lazyLoad.get(0).getUser());
        sqlSession.close();
    }

    /**
     * 一级缓存
     */
    @Test
    public void testfirstCasheDemo1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        //第一次查询
        User user1=userMapper.findUserById(1);
        System.out.println(user1);

        //进行增删改操作
        int i = userMapper.addUser(user1);
        //提交，同时清空一级缓存
        sqlSession.commit();

        //进行第二次查询
        User user2=userMapper.findUserById(1);
        System.out.println(user2);
        sqlSession.close();
    }


}
