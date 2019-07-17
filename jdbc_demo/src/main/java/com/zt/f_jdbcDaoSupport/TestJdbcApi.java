package com.zt.f_jdbcDaoSupport;

import com.zt.a_domin.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestJdbcApi {

    @Test
    public void nowHikari() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\jdbc_demo\\src\\main\\java\\com\\zt\\f_jdbcDaoSupport\\applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(2l);
        user.setUsername("zt_jdbc_dao_support");
        user.setPassword("32100");
        userDao.update(user);
    }
}
