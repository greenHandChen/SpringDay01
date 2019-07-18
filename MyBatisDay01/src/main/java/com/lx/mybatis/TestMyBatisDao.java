package com.lx.mybatis;

import com.lx.mybatis.Dao.Impl.UserDaoImpl;
import com.lx.mybatis.Dao.UserDao;
import com.lx.mybatis.Entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMyBatisDao {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testDao(){
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        //根据id查询
        System.out.println(userDao.findUserById(1));
        //根据用户名查询
        System.out.println(userDao.findUserByUsername("明"));
        //插入用户
        User user = new User();
        user.setUsername("李小红");
        user.setAddress("北京");
        System.out.println(userDao.addUser(user));
    }
}
