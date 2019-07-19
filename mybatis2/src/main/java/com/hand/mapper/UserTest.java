package com.hand.mapper;

import com.hand.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:UserTest
 * Author:Hejunfeng
 * Date:2019/7/19 18:44
 */
public class UserTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void  testB(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserById(10));
        sqlSession.close();
    }

    @Test
    public void testSecondCacheDemo01(){
        SqlSession sqlSession1=sqlSessionFactory.openSession();
        SqlSession sqlSession2=sqlSessionFactory.openSession();
        UserMapper userMapper1=sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2=sqlSession2.getMapper(UserMapper.class);
        userMapper1.findUserById(1);
        sqlSession1.close();
        userMapper2.findUserById(1);
        sqlSession2.close();
    }



    @Test
    public void testSecondCacheDemo03(){
        SqlSession sqlSession1=sqlSessionFactory.openSession();
        SqlSession sqlSession2=sqlSessionFactory.openSession();
        SqlSession sqlSession3=sqlSessionFactory.openSession();
        UserMapper userMapper1=sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2=sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3=sqlSession3.getMapper(UserMapper.class);
        userMapper1.findUserById(1);
        sqlSession1.close();

        User user =new User();
        user.setUsername("二级测试");
        userMapper2.addUser(user);
        sqlSession2.commit();
        sqlSession2.close();


        userMapper3.findUserById(1);
        sqlSession3.close();
    }




}