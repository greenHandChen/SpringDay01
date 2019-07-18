package org.hgh.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.hgh.dao.UserDao;
import org.hgh.dao.impl.UserDaoImpl;
import org.hgh.pojo.User;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class TestMybatisDao {
    InputStream inputStream = Resources.getResourceAsStream("sqlmapconfig.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    public TestMybatisDao() throws IOException {
    }

    @Test
    public void testDao1(){
        UserDao userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        System.out.println(userDao.findUserById(32));
        System.out.println(userDao.findUserByUsername("'%明%'"));
        User user = new User("dilidili",new Date(),0,"湖南");
        System.out.println(userDao.addUser(user));
    }
}
