package com.hand.dao.impl;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class BaseDaoImpl {
    SqlSessionFactory sqlSessionFactory = null;
    SqlSession sqlSession = null;

    public BaseDaoImpl() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("config/mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
