package com.hand.test;

import com.hand.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class demo{

    @Test
    public void mybatis_demo1() throws IOException {
        //1.读取全局配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //2.创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.读取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.执行查询，第一个参数是命名空间，sql的ID,第二个是查询的参数
        User user = sqlSession.selectOne("test.findUserById",1);
        System.out.println(user.toString());
        //5.关闭
        sqlSession.close();
    }

    @Test
    public void mybatis_demo2() throws IOException {
        //1.读取全局配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //2.创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.读取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.${}占位符的sql注入
        List<User> users = sqlSession.selectList("test.findUserByUsername","'%明%'");
        for(int i=0;i<users.size();++i){
            System.out.println(users.get(i));
        }
        //5.关闭
        sqlSession.close();
    }

    @Test
    public void demo03() throws IOException, ParseException {
        //1.读取全局配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //2.创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.读取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //${}占位符的sql注入
        User user = new User();
        user.setUsername("汉得");
        user.setAddress("广州");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse("2019-6-22");
        user.setBirth(date);
        int val = sqlSession.insert("test.addUser",user);
        System.out.println(val);
        //提交事务
        sqlSession.commit();
        //关闭
        sqlSession.close();
    }

    @Test
    public void demo04() throws IOException {
        //1.获取全局配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //2.创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //.获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //${}注入
        User user = new User();
        user.setUsername("工信大");
        user.setAddress("安徽");
        sqlSession.insert("test.addUserGetId",user);
        System.out.println(user.getId());
        //提交事务
        sqlSession.commit();
        //关闭
        sqlSession.close();
    }

    @Test
    public void demo05() throws IOException {
        //1.获取全局配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //2.获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //${}注入
        User user = new User();
        user.setUsername("吉珠");
        user.setAddress("广东珠海");
        sqlSession.insert("test.addUserGetUUID",user);
        System.out.println(user.getId());
        //提交事务
        sqlSession.commit();
        //关闭
        sqlSession.close();
    }
    
}
