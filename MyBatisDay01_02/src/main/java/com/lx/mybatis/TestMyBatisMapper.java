package com.lx.mybatis;

import com.lx.mybatis.Entity.User;
import com.lx.mybatis.Entity.UserQueryVO;
import com.lx.mybatis.Mapper.UserMapper;
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

public class TestMyBatisMapper {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testDao(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserById(1));
//        sqlSession.close();
    }

    @Test
    public void testPojo(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserQueryVO userQueryVO = new UserQueryVO();
        User user = new User();
        user.setAddress("河南");
        user.setSex(2);
        userQueryVO.setUser(user);
        System.out.println(mapper.findUserByUser(userQueryVO));
    }

    @Test
    public void testMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String,String> map = new HashMap<String, String>();
        map.put("username","小");
        System.out.println(userMapper.findUserByMap(map));
    }

    @Test
    public void testCount(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.countUser());
    }

    @Test
    public void testB(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUsernameAndAddressById(10));
    }

    @Test
    public void testUserResultMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.testResultMap(10));
    }

    @Test
    public void testLabel(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("小");
        System.out.println(userMapper.testLabel(user));
    }

}
