package com.txz.mybatis.test;

import com.txz.mybatis.dao.UserDaoImpl;
import com.txz.mybatis.domain.User;
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
    public void before() throws IOException {
        //1.读取全局配置文件
        InputStream is= Resources.getResourceAsStream("config/SqlMapConfig.xml");
        //2.创建SqlSessionFactory
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void testDao(){
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        //根据ID查询
        System.out.println(userDao.findUserById(28).getUsername());
        //根据用户名查询
        System.out.println(userDao.findUserByUsername("'汉%' or 1=1").get(0).getUsername());
        //插入用户
        User user = new User();
        user.setUsername("浏二中");
        user.setAddress("浏阳");
        System.out.println(userDao.addUser(user));
    }
}
