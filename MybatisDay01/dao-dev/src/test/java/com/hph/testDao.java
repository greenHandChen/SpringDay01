package com.hph;

import com.hph.dao.UserDaoImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class testDao {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void testDao() {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        System.out.println(userDao.findUserById(28).getUsername());
        System.out.println(userDao.findUserByUsername("胡"));
    }
}
