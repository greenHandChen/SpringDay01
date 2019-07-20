package com.yts.test;

import com.yts.beans.User;
import com.yts.dao.UserDaoImpl;
import com.yts.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class MybatisTest {

    ApplicationContext applicationContext;

    @Before
    public void before() {
        applicationContext = new ClassPathXmlApplicationContext("application.xml");
    }


    @Test
    public void demo() throws IOException {
        //创建sessionFactory

        UserDaoImpl dao = applicationContext.getBean(UserDaoImpl.class);
        User userById = dao.findUserById(1);

        System.out.println(userById.toString());


    }

    @Test
    public void testMapper() throws IOException {
        //创建sessionFactory

        UserMapper mapper = applicationContext.getBean(UserMapper.class);
        User userById = mapper.findUserById(1);
        System.out.println(userById.toString());


    }
}
