package com.ll.ms.test;

import com.ll.ms.mapper.OrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

public class UserMapperTest {

    private ApplicationContext ctx = null;

    @Before
    public void init(){
        ctx = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }


    @Test
    public void testFindOrdersExts(){

        OrderMapper orderMapper



    }


}
