package com.zt.e_properties;

import com.zt.a_domin.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestJdbcApi {

    @Test
    public void nowHikari() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\jdbc_demo\\src\\main\\java\\com\\zt\\e_properties\\applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(2l);
        user.setUsername("zt3");
        user.setPassword("3210");
        userDao.update(user);
    }
}
