package com.hand;

import com.hand.daoImpl.UserDao1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMybatisDao {

    @Test
    public void testUserMapperImpl(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext");
        UserDao1 userMapperImpl = applicationContext.getBean("userDao1", UserDao1.class);
        System.out.println(userMapperImpl.findUserById(1));
    }
}
