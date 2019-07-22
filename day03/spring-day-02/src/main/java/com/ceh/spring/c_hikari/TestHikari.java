package com.ceh.spring.c_hikari;

import com.ceh.spring.a_domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by enHui.Chen on 2019/7/17.
 */
public class TestHikari {
    @Test
    public void testUserDao() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\芜湖培训\\spring\\day02\\培训内容\\test\\spring-day-02\\src\\main\\java\\com\\ceh\\spring\\c_hikari\\applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(3L);
        user.setPassword("hibernate");
        userDao.update(user);
    }
}
