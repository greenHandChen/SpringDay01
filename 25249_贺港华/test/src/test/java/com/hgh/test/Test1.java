package com.hgh.test;

import com.hgh.dao.mapper.OrderMapper;
import com.hgh.pojo.Order;
import com.hgh.service.OrderService;
import com.hgh.vo.OrderVO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test1 {
    @Autowired
    SqlSessionFactory sqlSessionFactory;
    @Test
    public void test01(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        OrderVO orderVO = new OrderVO();
        orderVO.setOrderName("台式机");
        List<OrderVO> orderVOS = orderMapper.findOrderVOs(orderVO);
        for(OrderVO orderVO1:orderVOS){
            System.out.println(orderVO1);
        }

    }
}
