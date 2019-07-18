package com.hand;

import com.hand.dao.UserDao;
import com.hand.dao.UserDaoImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

public class TestDao {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }
    @Test
    public void testFindUserById(){
        UserDaoImpl userDao =new  UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        System.out.println(userDao.findUserById(1));
    }


}
