package com.xyh.mybaits;

import com.xyh.mybaits.Entity.User;
import com.xyh.mybaits.Entity.UserQuery;
import com.xyh.mybaits.Mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserMapperTest {

    private UserMapper userMapper;

    private SqlSession sqlSession;

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String resource = "MybaitsConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = sqlSessionFactory.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void testOneLevelCache(){
        userMapper.findUserById(1);
        System.out.println("---------------");

        User user = new User();
        user.setUsername("12312");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("13214");
        userMapper.addUser(user);
        sqlSession.commit();

        userMapper.findUserById(1);
        System.out.println("---------------");
    }

    @Test
    public void testTwoLevelCache(){
        User user = new User();
        user.setUsername("12312");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("13214");

        SqlSession sqlSession1=sqlSessionFactory.openSession();
        SqlSession sqlSession2=sqlSessionFactory.openSession();
        SqlSession sqlSession3=sqlSessionFactory.openSession();

        UserMapper userMapper1=sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2=sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3=sqlSession3.getMapper(UserMapper.class);

        userMapper1.findUserById(1);
        sqlSession1.close();

//        userMapper2.addUser(user);
//        sqlSession2.commit();
        sqlSession2.close();

        userMapper3.findUserById(1);
        sqlSession3.close();
    }

    @After
    public void destroy() {
        sqlSession.close();
    }
}
