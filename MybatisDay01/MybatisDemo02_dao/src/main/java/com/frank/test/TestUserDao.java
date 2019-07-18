package com.frank.test;

import com.frank.dao.UserDao;
import com.frank.dao.UserDaoImpl;
import com.frank.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class TestUserDao {
    //模拟使用Spring注入SqlSessionFactory对象
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }
    @Test
    public void test01(){
//        创建UserDaoImpl对象
        UserDaoImpl userDao = new UserDaoImpl();
        //注入SQLSessionFactory对象
        userDao.setSqlSessionFactory(sqlSessionFactory);
//        根据Id查询用户
        User user = userDao.findUserById(1);
        System.out.println(user);
        //根据用户姓查询用户列表
        List<User> list = userDao.findUserByUsername("张");
        for (User user1 : list) {
            System.out.println(user1);
        }
        //添加用户
        User user2 = new User();
        user2.setUsername("刘备");
        user2.setBirthday(new Date());
        user2.setSex(2);
        user2.setAddress("桃园");
        int row = userDao.addUser(user2);
        System.out.println("影响了"+row+"行");


    }
}
