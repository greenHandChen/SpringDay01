package com.ct.test;

import com.ct.domain.User;
import com.ct.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisWithSpringTest {
    @Test
    public void testFindUserById() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }
}
