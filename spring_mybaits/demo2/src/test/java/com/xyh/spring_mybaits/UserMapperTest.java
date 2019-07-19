package com.xyh.spring_mybaits;

import com.xyh.spring_mybaits.Mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMapperTest {

    private ApplicationContext applicationContext;

    @Before
    public void init() {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void findUserById(){
        UserMapper userMapper=applicationContext.getBean("userMapper", UserMapper.class);

        System.out.println(userMapper.findUserById(1));
    }
}
