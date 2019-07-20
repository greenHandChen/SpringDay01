package com.lhb.test;

import com.lhb.dao.OrdersExtsMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created By LHB on 2019/7/20;
 */
public class Test01 {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }


    @Test
    public void TestDemo01(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersExtsMapper ordersExtMapper = sqlSession.getMapper(OrdersExtsMapper.class);
//        ordersExtMapper.findOrdersExts()
    }
}
