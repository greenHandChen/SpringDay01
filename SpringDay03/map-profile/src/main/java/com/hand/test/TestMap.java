package com.hand.test;

import com.hand.dao.UserDao;
import com.hand.pojo.User;
import com.hand.vo.UserVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String source = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(source);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findUserByVO() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        UserVO userVO = new UserVO();
        User user = new User();
        user.setSex(1);
        user.setAddress("河南");
        userVO.setUser(user);
        List<User> userList = userDao.findUserByVO(userVO);
        userList.forEach(System.out::println);
    }

    @Test
    public void testMap() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        Map<String, String> map = new HashMap<>();
        map.put("username", "wang");
        List<User> userList = userDao.findUserByMap(map);
        userList.forEach(System.out::println);
    }

    @Test
    public void testCount() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        System.out.println("总共有" + userDao.countUser() + "条数据");
    }

    @Test
    public void testLabel() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setUsername("王");
        user.setSex(2);
        userDao.findByConditions(user).forEach(System.out::println);

    }
}
