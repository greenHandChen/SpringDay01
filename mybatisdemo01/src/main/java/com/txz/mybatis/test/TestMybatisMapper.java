package com.txz.mybatis.test;

import com.txz.mybatis.domain.User;
import com.txz.mybatis.domain.UserQueryVO;
import com.txz.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class TestMybatisMapper {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void before() throws IOException {
        //1.读取全局配置文件
        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //2.创建SqlSessionFactory
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void testMapper(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserById(30).getUsername());
        sqlSession.close();
    }

    @Test
    public void testA(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserQueryVO userQueryVO = new UserQueryVO();
        User user = new User();
        user.setAddress("河南");
        user.setSex(1);
        userQueryVO.setUser(user);
        System.out.println(mapper.findUserByUser(userQueryVO));
        sqlSession.close();
    }

    @Test
    public void testMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,String> map=new HashMap<String, String>();
        map.put("username","小");
        System.out.println(mapper.findUserByMap(map));
        sqlSession.close();
    }

    @Test
    public void testCount(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.countUser());
        sqlSession.close();
    }

    @Test
    public  void  testB(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.findUserNameAndAddressById(30).toString());
        sqlSession.close();
    }

    @Test
    public void testUserResultMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper.testResultMap(29).toString());
        sqlSession.close();
    }

    @Test
    public void testLabel(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("小");
        System.out.println(mapper.testIfAndWhereLabel(user).toString());
        sqlSession.close();
    }

}
