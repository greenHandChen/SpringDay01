package dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.User;

public class TestDemo2 {
    @Test
    public void testApiSpring(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:demo2.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        User user = new User();
        user.setId(4);
        user.setUsername("yyy");
        user.setPassword("12345");
        userDao.update(user);

    }
}
