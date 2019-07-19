package com.yhk.ms;

import com.yhk.ms.Dao.UserDao;
import com.yhk.ms.Pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    private  ApplicationContext ac;
    @Before
    public void init(){
        ac=new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
    }
    @Test
    public void testFindUserById(){
        //创建UserDao
        UserDao userDao = ac.getBean("userDao",UserDao.class);
        User userById = userDao.findUserById(1);
        System.out.println(userById);
    }
}
