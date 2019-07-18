package com.hand;

import com.hand.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    @Test
    public void demo01 () throws IOException {
        //读取配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //创建SQL session factory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行查询
        User user = sqlSession.selectOne("test.findUserById",1);
        System.out.println(user.getUsername());
        sqlSession.close();
    }
    @Test
    public void testFinUserByUsername () throws IOException {
        //读取配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //创建SQL session factory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行查询
        List<User> user = sqlSession.selectList("test.findUserByUsername","王五 OR 1=1");
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void testAddUser () throws IOException {
        //读取配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //创建SQL session factory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行查询
        User user = new User();
        user.setAddress("安徽");
        user.setUsername("yxp");
        int val = sqlSession.insert("test.addUser",user);
        System.out.println("--------------------"+val);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testAddUserGetId () throws IOException {
        //读取配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //创建SQL session factory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行查询
        User user = new User();
        user.setAddress("安徽");
        user.setUsername("yxp2");
        int val = sqlSession.insert("test.addUserGetId",user);
        System.out.println("--------------------"+user.getId());
        sqlSession.commit();
        sqlSession.close();
    }
}
