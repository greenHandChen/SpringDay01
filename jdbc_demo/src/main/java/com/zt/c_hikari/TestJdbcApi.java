package com.zt.c_hikari;

import com.zt.a_domin.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestJdbcApi {

    @Test
    public void nowHikari() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\jdbc_demo\\src\\main\\java\\com\\zt\\c_hikari\\applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(1l);
        user.setUsername("zt2");
        user.setPassword("321");
        userDao.update(user);
    }
}
