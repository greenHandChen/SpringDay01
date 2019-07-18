package com.hand;

import com.hand.dao.UserMapper;
import com.hand.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class TestMybatisMapper {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }
    @Test
    public void testDao(){
        SqlSession sqlSession =sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.findUserById(1));
    }
    @Test
    public void testUserQueryByUser(){
        SqlSession sqlSession =sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user =new User();
        user.setAddress("河南");
        user.setSex(2);
        System.out.println(userMapper.findUserById(1));
    }
    @Test
    public void testFindUserByMap(){
        SqlSession sqlSession =sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String,String> map = new HashMap<String,String>();
        map.put("username","小");
        System.out.println(userMapper.findUserByMap(map));
    }
    @Test
    public void testCountUser(){
        SqlSession sqlSession =sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.countUser());
    }
    @Test
    public void testFindUserNameAndAddressById(){
        SqlSession sqlSession =sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.findUserNameAndAddressById(1));
    }
    @Test
    public void testTestResuletMap(){
        SqlSession sqlSession =sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.testResultMap(1));
    }
    @Test
    public void testTestIfAndWhereLabel(){
        SqlSession sqlSession =sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(1);
        //user.setUsername("sss");
        System.out.println(userMapper.testIfAndWhereLabel(user));
    }
}
