package com.ceh.spring.d_druid;

import com.ceh.spring.a_domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by enHui.Chen on 2019/7/17.
 */
public class TestDruid {
    @Test
    public void testUserDao() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\芜湖培训\\spring\\day02\\培训内容\\test\\spring-day-02\\src\\main\\java\\com\\ceh\\spring\\d_druid\\applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(1L);
        userDao.delete(user);
    }
}
