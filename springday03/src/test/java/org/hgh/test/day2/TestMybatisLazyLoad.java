package org.hgh.test.day2;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.hgh.dao.mapper.OrderMapper;
import org.hgh.vo.OrderVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMybatisLazyLoad {
    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Test
    public void test01(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        List<OrderVO> orderVOS = orderMapper.findOrderInfoByLazyLoad(4);

        orderVOS.get(0).getUser();
        
    }
}
