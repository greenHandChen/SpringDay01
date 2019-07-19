package org.hgh.test.day2;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.hgh.dao.mapper.OrderMapper;
import org.hgh.pojo.User;
import org.hgh.vo.OrderVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMybatisOfOrder {
//    InputStream inputStream = Resources.getResourceAsStream("sqlmapconfig.xml");
//    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void test01(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        OrderVO orderVO = orderMapper.findOrderVOById(3);
        System.out.println(orderVO.getOrderDetail());
        sqlSession.close();
    }

    @Test
    public void test02(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        System.out.println(orderMapper.findOrderList());
        sqlSession.close();
    }

    @Test
    public void test03(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrderVO> orderVO = orderMapper.findOrderDetials();
        System.out.println(orderVO);
        sqlSession.close();
    }
}
