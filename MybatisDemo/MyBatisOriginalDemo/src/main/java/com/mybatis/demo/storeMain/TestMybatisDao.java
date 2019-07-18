package com.mybatis.demo.storeMain;

import com.mybatis.demo.storeDao.UserDaoImpl;
import com.mybatis.demo.storeDto.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatisDao {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void test03(){
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setSqlSessionFactory(sqlSessionFactory);
        User user = userDao.selectUserInfo(33);
        List<User> ls = userDao.selectUser("'王%'");
        int val = userDao.addUser();
        System.out.println(user.getUsername());
        for (User u: ls) {
            System.out.println(u.getUsername()+" "+u.getId());
        }
        System.out.println(val);
    }
}
