package com.ljx.mybatisdao.dao;

import com.ljx.mybatisdao.dao.impl.UserDaoImpl;
import com.ljx.mybatisdao.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * @author LinJianXiong
 * @Date 2019/7/18
 * @Time 11:14
 */
public class UserDaoTest {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void setUp() throws Exception {
        // 读取配置文件
        // 全局配置文件的路径
        InputStream inputStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");

        // 创建SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void testFindUserById() throws Exception {

        // 创建UserDao
        UserDao dao = new UserDaoImpl(sqlSessionFactory);

        User user = dao.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void testFindUsersByName() {
        fail("Not yet implemented");
    }

    @Test
    public void testInsertUser() {
        fail("Not yet implemented");
    }
}