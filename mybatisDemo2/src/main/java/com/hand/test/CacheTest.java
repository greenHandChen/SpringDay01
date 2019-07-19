package com.hand.test;

import com.hand.dao.OrderMapper;
import com.hand.dao.UserMapper;
import com.hand.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:CacheTest
 * Author:ZhangChunjia
 * Date:2019/7/19 16:20
 */
public class CacheTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/mybatis-1.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    //一级缓存测试
    @Test
    public void test01() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        orderMapper.findUserByIdLazyLoad(1);
        User user = new User();
        user.setUser_id(3);
        user.setUsername("测试一级缓存");
        user.setAddress("在芜湖测试");
        userMapper.addUser(user);
        sqlSession.commit();

        orderMapper.findUserByIdLazyLoad(1);
        sqlSession.close();
    }

    //二级缓存测试
    //由于二级缓存是mapper级别，是跨sqlSession,
    // 所以需要创建多个sqlSession进行测试，第一个sqlSession关闭后,第二个sqlSession仍不走数据库查询。
    @Test
    public void test02() {
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();

        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper userMapper2 = sqlSession2.getMapper(UserMapper.class);
        UserMapper userMapper3 = sqlSession3.getMapper(UserMapper.class);
        //
        userMapper1.findUserById(1);
        sqlSession1.close();
        //
        User user = new User();
        user.setUser_id(4);
        user.setUsername("测试二级缓存");
        user.setAddress("在芜湖测试");
        userMapper2.addUser(user);
        sqlSession2.commit();
        sqlSession2.close();
        //
        userMapper3.findUserById(1);
        sqlSession3.close();
    }
}
