package com.hand.mybatis.junit;

import com.hand.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MabatisTest {



    @Test

    public void testMybatis() throws Exception {
        //加载核心配置文件
        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //执行Sql语句
        User user = sqlSession.selectOne("test.findUserById", 10);

        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testFindUserByUserName() throws Exception {

        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //执行Sql语句
        List<User> user = sqlSession.selectList("test.findUserByUserName", "张");

        for (User users : user) {
            System.out.println(users);
        }


    }
    @Test
    public void testInsertUser() throws Exception {

        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user =new User();

        user.setUsername("大法师");
        user.setBirthday(new Date());
        user.setAddress("爱的方式度过");
        user.setSex("男");
        //执行Sql语句
        sqlSession.insert("test.insertUser", user);

        sqlSession.commit();
        System.out.println(user.getId());
    }

    @Test
    public void testUpdateUser() throws Exception {

        String resource = "sqlMapConfig.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        //创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user =new User();
        user.setId(32);
        user.setUsername("dsfssa");
        user.setBirthday(new Date());
        user.setAddress("asd");
        user.setSex("男");
        sqlSession.update("test.UpdateById", user);
        //执行Sql语句
        sqlSession.commit();

    }




}
