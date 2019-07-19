package com.hand.service;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;



public class MybatisTest {
    private static ApplicationContext applicationContext=null;


    static {
        applicationContext=new ClassPathXmlApplicationContext("application.xml");
    }
    @Test
    public void test1(){

    }
    public void test(){
        SqlSessionFactoryBean sqb=(SqlSessionFactoryBean)applicationContext.getBean("sqlSessionFactoryBean");
        SqlSessionFactory sf=sqb.getObject();
    }
}
