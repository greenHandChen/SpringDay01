package com.itheima.mybatis.po;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyBatisFirst {
    SqlSessionFactory sqlSessionFactory = null;
    SqlSession sqlSession = null ;
    @Before
    public void init()throws IOException{
        //全局配置文件的路径
        String resources ="SqlMapConfig.xml";
        //读取配置文件
        InputStream inputStream =  Resources.getResourceAsStream(resources);
        //创建sqlsessionfactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlsessionFactory
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void findUserById() throws IOException {
        //通过调用sqlsession的增删改查的方法
        //第一个参数：表示statement的唯一标识
        User user = sqlSession.selectOne("test.findUserById",1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void findUsersByName() throws IOException {
        //通过调用sqlsession的增删改查的方法
        //第一个参数：表示statement的唯一标识
        List<User> list  = sqlSession.selectList("test.findUsersByName","小明");
        System.out.println(list);
        sqlSession.close();
    }

    @Test
    public void insertUserTest() throws IOException {
        //通过调用sqlsession的增删改查的方法
        //第一个参数：表示statement的唯一标识
        User user = new User();
        user.setUsername("sky");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("广东");
        sqlSession.insert("test.insertUser",user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }

}
