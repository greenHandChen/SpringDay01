package com.st.hikari;

import com.st.hikari.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHikari {

    @Test
    public void testHikari(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/st/hikari/beans.xml");
        User user =(User) applicationContext.getBean("user");
        UserDao userDao = new UserDao();
        user.setId(2);
        user.setUsername("蔡徐坤");
        user.setPassword("567890");
        userDao.update(user);
    }
}
