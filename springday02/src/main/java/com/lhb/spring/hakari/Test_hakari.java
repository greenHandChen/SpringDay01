package com.lhb.spring.hakari;

import com.lhb.spring.a_domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By LHB on 2019/7/17;
 */
public class Test_hakari {

    @Test
    public void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com.lhb.spring/applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user=new User();
        user.setId(4);
        user.setUsername("lhb");
        user.setPassword("123");
        userDao.update(user);
    }
}
