package com.hand.ms.dao;


import com.hand.ms.dao.UserDao;
import com.hand.ms.po.User ;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;


/**
 * @Author xiongyilin
 * @Date 2019/7/19 15:18
 * @Version 1.0
 */

public class UserDaoTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp(){
        applicationContext=new FileSystemXmlApplicationContext
                ("C:\\Users\\75741\\combine\\src\\main\\resources\\spring\\applicationContext.xml");
   }

    @Test
    public void findUserById() throws Exception {
        UserDao dao= (UserDao)applicationContext.getBean("userDao");
        User user = dao.findUserById(1);
        System.out.println(user);
    }
}