package com.hand.test;

import com.hand.sysmanager.dao.impl.UserDaoImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author lwy
 * @version V1.0
 * @program: SpringDay01
 * @Description: TODO
 * @date 2019/7/18 16:58
 */
public class MybatisDaoTest {


    @Test
    public void testDao() throws Exception
    {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(factory);
        System.out.println(userDao.findUserById(1L));
        System.out.println(userDao.findUserByUsername("张"));


    }
}
