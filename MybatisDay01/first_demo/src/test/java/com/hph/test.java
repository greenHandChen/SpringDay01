package com.hph;


import com.hph.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {

    @Test
    public void demo1() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.findUserById", 1);
        System.out.println(user.getUsername());
        sqlSession.close();
    }

    @Test
    public void demo2() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("test.findUserByUsername", "'%明%' OR 1=1");
        for (User user: users
             ){
            System.out.print(user.getUsername()+" ");
        }
        sqlSession.close();
    }

    @Test
    public void demo3() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("胡鹏浩");
        user.setAddress("长沙");
        int val = sqlSession.insert("test.addUser", user);
        System.out.println(val);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void demo4() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("胡鹏浩2");
        user.setAddress("长沙2");
        sqlSession.insert("test.addUserGetId", user);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }


}
