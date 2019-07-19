package com.hand.mybatis.mapper;

import com.hand.mybatis.po.OrdersCustom;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;


/**
 * @Author xiongyilin
 * @Date 2019/7/19 11:05
 * @Version 1.0wozhelika de yipi kanbuqing
 */

public class OrdersMapperCustomTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void SetUp() throws Exception {
        //读取配置文件
        String resource = "config/SqlMapConfig.xml";//这里可以找到这个文件
        InputStream inputStream = Resources.getResourceAsStream(resource);

        //创建SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findOrdersUser() throws Exception {
        SqlSession sqlsession=sqlSessionFactory.openSession();
        //创建代理对象
        OrdersMapperCustom ordersMapperCustom=sqlsession.getMapper(OrdersMapperCustom.class);

        //调用mapper方法
        List<OrdersCustom> list=ordersMapperCustom.findOrdersUser();

        System.out.println(list);

        sqlsession.close();

    }
}