package com.yhk.ms;

import com.yhk.ms.Mapper.UserMapper;
import com.yhk.ms.Pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserMapper {
    private ApplicationContext ac;

    @Before
    public void init(){
        ac=new ClassPathXmlApplicationContext("config/spring/applicationContext.xml");
    }
    @Test
    public void testFindUserById(){
        UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
        User userById = userMapper.findUserById(1);
        System.out.println(userById);
    }
}
