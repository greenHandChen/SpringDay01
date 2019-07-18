package com.itheima.mybatis.mapper;

import com.itheima.mybatis.po.User;
import com.itheima.mybatis.po.UserQueryVO;
import org.apache.ibatis.io.Resources;
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

import static org.junit.Assert.*;

public class UserMapperTest {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void setUp() throws IOException {
        String resources ="SqlMapConfig.xml";
        //读取配置文件
        InputStream inputStream =  Resources.getResourceAsStream(resources);
        //创建sqlsessionfactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }

    @Test
    public void testFinUserById() throws Exception {
        //创建usermapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //有mybatis通过sqlsession来创建代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserById(1);
        System.out.println(user);
        sqlSession.close();
    }


    @Test
    public void testInsertUser() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //有mybatis通过sqlsession来创建代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("sky");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("广东");
        userMapper.insertUser(user);
        System.out.println(user.getId());
        sqlSession.commit();

    }


    @Test
    public void testFindUserList() throws Exception {
        //创建usermapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //有mybatis通过sqlsession来创建代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        UserQueryVO vo = new UserQueryVO();
        User user = new User();
        user.setUsername("sky");
        user.setSex("男");
        vo.setUser(user);
        List<Integer> idLIst = new ArrayList<Integer>();
        idLIst.add(1);
        idLIst.add(2);
        idLIst.add(10);
        vo.setIdList(idLIst);
        List<User> list = userMapper.findUserList(vo);
        System.out.println(list);
        sqlSession.close();
    }


    @Test
    public void testFinUserCount() throws Exception {
        //创建usermapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //有mybatis通过sqlsession来创建代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        UserQueryVO vo = new UserQueryVO();
        User user = new User();
        user.setUsername("sky");
        user.setSex("男");
        vo.setUser(user);
        int a = userMapper.findUserCount(vo);
        System.out.println(a);
        sqlSession.close();
    }


    @Test
    public void testFinUserRstMap() throws Exception {
        //创建usermapper对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //有mybatis通过sqlsession来创建代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findUserResultMap(1);
        System.out.println(user);
        sqlSession.close();
    }



}