package com.hand.test;

import com.hand.dao.UserDaoa;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMapperAgency {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String source = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(source);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testMapperAgency() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDaoa userDaoa = sqlSession.getMapper(UserDaoa.class);
        userDaoa.findUserByUsername("明").forEach(System.out::println);
    }
}
