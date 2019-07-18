package com.frank.test;

import com.frank.domain.User;
import com.frank.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Demo01 {

    /**
     * @Descrition 根据用户id查询用户信息
     * @throws IOException
     */
    @Test
    public void test() throws IOException {
        InputStream is  = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("test.getUserById", 1);
        System.out.println(user);
        sqlSession.close();
    }

    /**
     * 根据用户的姓查询用户信息
     */
    @Test
    public void test2(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> list= sqlSession.selectList("test.getUserByUsername", "'%张%' or 1=1");
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    /**
     * 插入用户
     */
    @Test
    public void test03(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("李四");
        user.setBirthday(new Date());
        user.setSex(1);
        user.setAddress("湖北武汉");
        sqlSession.insert("test.addUser",user);
        //提交事务(如果不想提交就这样写openSession(true))
        sqlSession.commit();
        //释放连接
        sqlSession.close();
    }
    /**
     * 插入用户返回UUID
     */
    @Test
    public void test04(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("刘老四");
        user.setBirthday(new Date());
        user.setSex(1);
        user.setAddress("上海");
        sqlSession.insert("test.addUserGetUUID",user);
        //提交事务
        sqlSession.commit();
        System.out.println(user);
        //释放连接
        sqlSession.close();
    }
    /**
     * 插入用户返回自增主键
     */
    @Test
    public void test05(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("张飞");
        user.setBirthday(new Date());
        user.setSex(1);
        user.setAddress("湖南");
        sqlSession.insert("test.addUserGetId",user);
        //提交事务(如果不想提交就这样写openSession(true))
        sqlSession.commit();
        System.out.println(user);
        //释放连接
        sqlSession.close();
    }

}
