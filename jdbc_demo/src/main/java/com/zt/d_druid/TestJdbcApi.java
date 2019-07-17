package com.zt.d_druid;

import com.zt.a_domin.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestJdbcApi {

    @Test
    public void nowDruid() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\jdbc_demo\\src\\main\\java\\com\\zt\\d_druid\\applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(1l);
        userDao.delete(user);
    }
}
