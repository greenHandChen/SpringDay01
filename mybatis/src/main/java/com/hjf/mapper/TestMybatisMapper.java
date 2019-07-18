package com.hjf.mapper;

import com.hjf.pojo.User;
import com.hjf.pojo.UserQueryVO;
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

/**
 * ClassName:TestMybatisMapper
 * Author:Hejunfeng
 * Date:2019/7/18 15:42
 */
public class TestMybatisMapper {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException{
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
    public void testA(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        UserQueryVO userQueryVO=new UserQueryVO();
        User user=new User();
        user.setAddress("河南");
        user.setSex(1);
        userQueryVO.setUser(user);
        System.out.println(mapper.findUserByUser(userQueryVO));
        sqlSession.close();
    }

    @Test
    public void testMap(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        Map<String,String> map=new HashMap<String, String>();
        map.put("username","小");
        System.out.println(mapper.findUserByMap(map));
        sqlSession.close();
    }

    @Test
    public  void testCount(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.countUser());
        sqlSession.close();
    }

    @Test
    public  void findUserNameAndAddressById(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserNameAndAddressById(10));
        sqlSession.close();
    }

    @Test
    public void testResultMap(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.testResultMap(10));
        sqlSession.close();
    }
}