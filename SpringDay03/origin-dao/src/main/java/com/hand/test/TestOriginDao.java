package com.hand.test;

import com.hand.dao.impl.UserDaoImpl;
import com.hand.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestOriginDao {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String source = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(source);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testDao() {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        //查询
        System.out.println(userDao.findUserById(1));
        //根据用户名模糊查询
        String val = "明";
        System.out.println("查询用户名里包含" + val + "的用户");
        userDao.findUserByUsername(val).forEach(System.out::println);
        //添加
        User user = new User();
        user.setUsername("wangjun");
        user.setSex(1);
        int i = userDao.addUser(user);
        System.out.println("插入了" + i + "条数据");
    }

}
