package com.xyh.mybaits;

import com.xyh.mybaits.Entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class UserTest {

    private SqlSession sqlSession;

    @Before
    public void init() throws IOException {
        String resource="MybaitsConfig.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession=sqlSessionFactory.openSession();
    }

    @Test
    public void findUserById(){
        User user=sqlSession.selectOne("user.findUserById",1);
        System.out.println(user.toString());
    }

    @Test
    public void findUserByName(){
        List<User> users=sqlSession.selectList("user.findUserByName","李");
        System.out.println(users.size());
    }

    @Test
    public void addUser(){

        User user=new User();
        user.setUsername("王五");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("fwqfew");

        sqlSession.insert("user.addUser",user);
        System.out.println(user.toString());
        sqlSession.commit();
        System.out.println(user.toString());
    }

    @Test
    public void updateById(){
        User user=new User();
        user.setId(3);
        user.setUsername("龙七");
        user.setSex("女");
        user.setBirthday(new Date());
        user.setAddress("afagfa");
        sqlSession.update("user.updateById",user);
        sqlSession.commit();
    }

    @Test
    public void deleteById(){
        sqlSession.delete("user.deleteById",8);
        sqlSession.commit();
    }

    @After
    public void destroy(){
        sqlSession.close();
    }
}
