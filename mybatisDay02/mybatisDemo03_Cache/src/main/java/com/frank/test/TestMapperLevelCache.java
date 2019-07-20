package com.frank.test;

import com.frank.mapper.OrderMapper;
import com.frank.mapper.UserMapper;
import com.frank.pojo.User;
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

public class TestMapperLevelCache {
    private SqlSessionFactory sqlSessionFactory;
    private InputStream is;
    /**
     * 初始化信息
     * @throws IOException
     */
    @Before
    public void init() throws IOException {
        //加载文件流
         is = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

    }
    @After
    public void destroy() throws IOException {
        is.close();
    }

    /**
     * 测试一级缓存
     */
    @Test
    public void test01() {
        //创建openSession1对象
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        //创建userMapper对象
        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        User user1 = userMapper1.findUserById(16);
        System.out.println(user1);
        sqlSession1.close();

        //创建openSession2对象
        SqlSession sqlSession2 = sqlSessionFactory.openSession();

        //创建userMapper对象
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = userMapper2.findUserById(16);
        System.out.println(user2);

        sqlSession2.close();
        System.out.println(user1==user2);

    }



}
