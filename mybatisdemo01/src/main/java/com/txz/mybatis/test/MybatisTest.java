package com.txz.mybatis.test;
import com.txz.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void before() throws IOException {
        //1.读取全局配置文件
        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //2.创建SqlSessionFactory
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void demo01() throws IOException {
        //1.读取全局配置文件
        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //2.创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //3.读取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.执行查询，第一参数是命名空间.sql的ID，第二个参数是查询的参数
        User user = sqlSession.selectOne("test.findUserById", 1);
        System.out.println(user.getUsername());
        //5.关闭sqlSession 释放连接
        sqlSession.close();
    }

    @Test
    public void demo02(){
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //${ }占位符的sql注入演示
        List<User> users = sqlSession.selectList("test.findUserByUsername","'%明%' or 1=1");
        System.out.println(users.get(0).getUsername());
        //关闭sqlSession 释放连接
        sqlSession.close();
    }

    @Test
    public void demo03(){
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //#{ }占位符的sql注入演示
        User user =new User();
        user.setUsername("汉得");
        user.setAddress("上海");
        int val=sqlSession.insert("test.addUser",user);
        System.out.println(val);
        //提交事务
        sqlSession.commit();
        //释放连接
        sqlSession.close();
    }

    @Test
    public void demo04(){
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //${ }占位符的sql注入演示
        User user = new User();
        user.setUsername("工信大");
        user.setAddress("安徽");
        sqlSession.insert("test.addUserGetId", user);
        System.out.println(user.getId());
        //提交事务
        sqlSession.commit();
        //释放连接
        sqlSession.close();
    }

    @Test
    public void demo05(){
        //获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //${ }占位符的sql注入演示
        User user = new User();
        user.setUsername("涉外");
        user.setAddress("长沙");
        sqlSession.insert("test.addUserGetUUID",user);
        System.out.println(user.getId());
        //提交事务
        sqlSession.commit();
        //释放连接
        sqlSession.close();
    }
}
