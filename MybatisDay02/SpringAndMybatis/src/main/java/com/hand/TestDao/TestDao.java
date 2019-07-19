package com.hand.TestDao;

import com.hand.mapper.UserMapper;
import com.hand.mapper.UserMapperImpl;
import javafx.application.Application;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;


public class TestDao {
    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/springConfig.xml");
        UserMapper userMapper= applicationContext.getBean("userMapper",UserMapper.class);
        System.out.println(userMapper.findUserById(10));
    }
    /*@Test
    public void test2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config/springConfig.xml");
        applicationContext.getM
    }*/
}
