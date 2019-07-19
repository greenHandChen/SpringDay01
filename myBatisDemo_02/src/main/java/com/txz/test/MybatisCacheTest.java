package com.txz.test;

import com.txz.domain.User;
import com.txz.mapper.OrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MybatisCacheTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void info() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/sqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public  void testFirstCacheDemo01(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        //两次查询第二次不走数据库
        mapper.findUserById(1);
        mapper.findUserById(1);
        sqlSession.close();
    }

    @Test
    public  void testFirstCacheDemo02(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        mapper.findUserById(1);
        User user = new User();
        user.setUsername("缓存测试");
        mapper.addUser(user);

        mapper.findUserById(1);
        sqlSession.close();
    }

    @Test
    public void testSecondCacheDemo02(){
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession3 = sqlSessionFactory.openSession();

        OrderMapper mapper1 = sqlSession1.getMapper(OrderMapper.class);
        OrderMapper mapper2 = sqlSession2.getMapper(OrderMapper.class);
        OrderMapper mapper3 = sqlSession3.getMapper(OrderMapper.class);

        mapper1.findUserById(1);
        sqlSession1.close();
        mapper2.findUserById(1);
        sqlSession2.close();
    }
}
