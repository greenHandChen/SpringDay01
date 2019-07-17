package com.zt.g_query;

import com.zt.a_domin.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestJdbcApi {

    private UserDao userDao;

    @Before
    public void init() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\jdbc_demo\\src\\main\\java\\com\\zt\\g_query\\applicationContext.xml");
        userDao = applicationContext.getBean("userDao", UserDao.class);
    }

    @Test
    public void nowQuery01() {
        userDao.query01();
    }

    @Test
    public void nowQuery02() {
        userDao.query02();
    }

    @Test
    public void nowQuery03() {
        User user = new User();
        user.setId(2l);
        System.out.println(userDao.query03(user).getUsername());
    }

    @Test
    public void nowQuery04() {
        System.out.println(userDao.query04());
    }

}
