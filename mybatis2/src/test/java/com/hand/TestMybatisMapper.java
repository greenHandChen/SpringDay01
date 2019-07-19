package com.hand;

import com.hand.dao.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class TestMybatisMapper {
    @Test
    public void testUserMapperImpl() throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2");
        UserMapper userMapper = applicationContext.getBean("userMapper", UserMapper.class);
        System.out.println(userMapper.findUserById(1));
    }
}
