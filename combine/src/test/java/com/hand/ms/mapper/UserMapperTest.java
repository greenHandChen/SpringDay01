package com.hand.ms.mapper;

import com.hand.ms.dao.UserDao;
import com.hand.ms.po.User ;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import static org.junit.Assert.*;


/**
 * @Author xiongyilin
 * @Date 2019/7/19 15:44
 * @Version 1.0
 */

public class UserMapperTest {

    private ApplicationContext applicationContext ;

    @Before
    public void setUp(){
        applicationContext=new FileSystemXmlApplicationContext
                ("C:\\Users\\75741\\combine\\src\\main\\resources\\spring\\applicationContext.xml");
    }

    @Test
    public void findUserById () throws Exception {
        UserMapper userMapper=(UserMapper)applicationContext.getBean("userMapper");
        User user = userMapper.findUserById(1);
        System.out.println(user);

    }
}