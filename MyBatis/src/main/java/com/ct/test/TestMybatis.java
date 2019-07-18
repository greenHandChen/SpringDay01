package com.ct.test;

import com.ct.domain.User;
import com.ct.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

public class TestMybatis {

    @Test
    public void testFindUserById() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("com.ct.mapper.UserMapper.findUserById", 1);
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        User user = userMapper.findUserById(1);
        System.out.println(user.getUsername());
        sqlSession.close();
    }

    @Test
    public void testAddUserGetId() throws IOException, ParseException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //初始化user
        User user = new User();
        user.setUsername("程添");
        user.setSex(1);
        user.setBirthday(new Date(new SimpleDateFormat("yyyy-MM-dd").parse("1998-10-25").getTime()));
        user.setAddress("湖南邵东");
        //原始dao方式，硬编码
        //sqlSession.insert("com.ct.mapper.UserMapper.addUserGetId", user);
        //使用Mapper方式
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.addUserGetId(user);
        System.out.println(user.getId() + " " + user.getUsername() + " " + user.getBirthday());
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testFindUserByUsername() throws IOException, ParseException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //List<User> users = sqlSession.selectList("com.ct.mapper.UserMapper.findUserByUsername", "张%");
        List<User> users = sqlSession.getMapper(UserMapper.class).findUserByUsername("张%");
        for(User user : users) {
            System.out.println(user.getUsername());
        }
        sqlSession.close();
    }
}
