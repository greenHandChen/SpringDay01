package com.ceh.mybatis;

import com.ceh.mybatis.dao.UserDaoImpl;
import com.ceh.mybatis.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by enHui.Chen on 2019/7/8.
 */
public class TestMybatisDao {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        // 1.读取全局配置文件
        InputStream is = Resources.getResourceAsStream("config/SqlMapConfig.xml");
        // 2.创建SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void testDao() {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        // 根据ID查询
        System.out.println(userDao.findUserById(33));
        // 根据用户名查询
        System.out.println(userDao.findUserByUsername("汉"));
        // 插入用户
        User user = new User();
        user.setUsername("工信大");
        user.setAddress("安徽");
        System.out.println(userDao.addUser(user));
    }
}
