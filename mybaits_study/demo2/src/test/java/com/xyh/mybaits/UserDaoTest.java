package com.xyh.mybaits;

import com.xyh.mybaits.Dao.UserDao;
import com.xyh.mybaits.DaoImpl.UserDaoImpl;
import com.xyh.mybaits.Entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class UserDaoTest {

    private UserDao userDao;

    @Before
    public void init() throws IOException {
        String resource="MybaitsConfig.xml";
        InputStream inputStream=Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        userDao=new UserDaoImpl(sqlSessionFactory);
    }

    @Test
    public void findUserById(){
        User user=userDao.findUserById(1);
        System.out.println(user.toString());
    }

    @Test
    public void findUserByName(){
        List<User> users=userDao.findUserByName("五");
        System.out.println(users.size());
    }

    @Test
    public void addUser(){

        User user=new User();
        user.setUsername("w五");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("fwqfew");

        userDao.addUser(user);
    }

    @Test
    public void updateById(){
        User user=new User();
        user.setId(2);
        user.setUsername("龙few七");
        user.setSex("女");
        user.setBirthday(new Date());
        user.setAddress("faafafafa");
        userDao.updateById(user);
    }

    @Test
    public void deleteById(){
        userDao.deleteById(11);
    }
}
