package com.lhb.spring.druid;

import com.lhb.spring.a_domain.User;
import com.lhb.spring.druid.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By LHB on 2019/7/17;
 */
public class Test_druid {
    @Test
    public  void test01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com.lhb.spring/applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user = new User();
        user.setId(4);
        user.setUsername("lihaibo");
        user.setPassword("lhb123");
        userDao.update(user);
    }

    @Test
    public  void test02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com.lhb.spring/applicationContext.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        User user=new User();
        user.setId(5);
        userDao.delete(user);
    }

}
