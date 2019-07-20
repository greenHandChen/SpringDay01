package com.hand.am.test;

import com.hand.am.dao.UserDao;
import com.hand.am.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: 王俊
 * @Date: 2019/7/19 11:20
 **/
public class CacheTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String source = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(source);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFirstCacheDemo1() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.findUserById(1);
        userDao.findUserById(1);
        sqlSession.close();
    }

    @Test
    public void testFirstCacheDemo2() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.findUserById(1);
        User user = new User();
        user.setUsername("缓存测试");
        userDao.addUser(user);
        sqlSession.commit();
        userDao.findUserById(1);
        sqlSession.close();
    }

    @Test
    public void testSecondCacheDemo1() {
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        UserDao userDao1 = sqlSession1.getMapper(UserDao.class);
        UserDao userDao2 = sqlSession2.getMapper(UserDao.class);
        userDao1.findUserById(1);
        sqlSession1.close();
        userDao2.findUserById(1);
        sqlSession2.close();
    }

    @Test
    public void testSecondCacheDemo2() {
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();

        UserDao userDao1 = sqlSession1.getMapper(UserDao.class);
        UserDao userDao2 = sqlSession2.getMapper(UserDao.class);
        UserDao userDao3 = sqlSession3.getMapper(UserDao.class);
        userDao1.findUserById(1);
        sqlSession1.close();

        User user=new User();
        user.setUsername("二级缓存测试");
        userDao3.addUser(user);
        sqlSession3.commit();
        sqlSession3.close();

        userDao2.findUserById(1);
        sqlSession2.close();
    }
}
