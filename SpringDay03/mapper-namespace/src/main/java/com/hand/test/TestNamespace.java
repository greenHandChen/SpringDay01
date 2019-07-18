package com.hand.test;

import com.hand.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestNamespace {

    @Test
    public void findUserById() throws IOException {
        SqlSession sqlSession = getSqlSession();
        User user = sqlSession.selectOne("test.findUserById", 1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void findUserByUsername() throws IOException {
        SqlSession sqlSession = getSqlSession();
        List<User> userList = sqlSession.selectList("test.findUserByUsername", "明");
        userList.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void addUser() throws IOException {
        SqlSession sqlSession = getSqlSession();
        User user = new User();
        user.setUsername("王俊");
        user.setSex(1);
        user.setAddress("四川省成都市");
        int i = sqlSession.insert("test.addUser", user);
        System.out.println("插入了" + i + "条数据");
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addUserGetId() throws IOException {
        SqlSession sqlSession = getSqlSession();
        User user = new User();
        user.setUsername("老王");
        user.setSex(1);
        user.setAddress("四川省广安市");
        int i = sqlSession.insert("test.addUserGetId", user);
        System.out.println("插入了" + i + "条数据,插入数据的id是:" + user.getId());
        sqlSession.commit();
        sqlSession.close();
    }

    //UUID不行
   /* @Test
    public void addUserGetUUID() throws IOException {
        SqlSession sqlSession = getSqlSession();
        User user = new User();
        user.setUsername("阿俊");
        user.setSex(1);
        user.setAddress("四川省绵阳市");
        int i = sqlSession.insert("test.addUserGetUUID", user);
        System.out.println("插入了" + i + "条数据,插入数据的id是:" + user.getId());
        sqlSession.commit();
        sqlSession.close();
    }*/
    @Test
    public void deleteUserById() {

    }

    private SqlSession getSqlSession() throws IOException {
        String source = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(source);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }
}