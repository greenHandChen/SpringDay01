package com.hand.test;

import com.hand.dao.UserDaoImpl;
import com.hand.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatisDao {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        //获取全局配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //创建SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

    }

    @Test
    public void testDao(){
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        //根据ID查询
        System.out.println(userDao.findUserById(3));
        //根据用户名查询
        System.out.println(userDao.findUserByUsername("汉"));
        //插入用户
        User user = new User();
        user.setUsername("华南理工");
        user.setAddress("广东广州");
        System.out.println(userDao.addUser(user));
    }
}
