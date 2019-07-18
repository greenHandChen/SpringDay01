package com.hph;

import com.hph.dao.UserMapper;
import com.hph.entity.User;
import com.hph.entity.UserQueryVo;
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

public class testMapper {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void demo1() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserQueryVo userQueryVo = new UserQueryVo();
        User user = new User();
        user.setAddress("长沙");
        user.setSex(1);
        userQueryVo.setUser(user);
        System.out.println(userMapper.findUserByUser(userQueryVo).get(0).getUsername());
    }

    @Test
    public void demo2() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String, String> map = new HashMap<String, String>();
        map.put("username", "小");
        System.out.println(userMapper.findUserByMap(map).get(0).getUsername());
    }

    @Test
    public void demo3() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.testResultMap(28).getUsername());
    }

    @Test
    public void demo4() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("小");
        System.out.println(userMapper.testIfAndWhereLable(user).get(0).getUsername());
    }
}
