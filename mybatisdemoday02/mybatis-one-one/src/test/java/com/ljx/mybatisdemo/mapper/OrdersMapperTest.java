package com.ljx.mybatisdemo.mapper;

import com.ljx.mybatisdemo.po.OrdersExt;
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
 * @author LinJianXiong
 * @Date 2019/7/19
 * @Time 9:52
 */
public class OrdersMapperTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        // 读取配置文件
        // 全局配置文件的路径
        String resource = "config/SqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);

        // 创建SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindOrdersAndUser() {
        // 创建OrdersMapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);

        List<OrdersExt> list = mapper.findOrdersAndUser();

        for (OrdersExt o : list){
            System.out.println(o.getId());
        }

        sqlSession.close();
    }

    @Test
    public void testFindOrdersAndUserRstMap() {
        // 创建OrdersMapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);

        List<OrdersExt> list = mapper.findOrdersAndUserRstMap();

        for (OrdersExt o : list){
            System.out.println(o.getId());
        }

        sqlSession.close();
    }




}