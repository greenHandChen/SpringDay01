package com;

import com.dao.IUserDao;
import com.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 22:21 2019/7/19
 * @Modified By:
 */
public class TestUserMapper {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        UserMapper userMapper = applicationContext.getBean("userMapper", UserMapper.class);
        System.out.println(userMapper.findUserById(1));
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        UserMapper userMapper = applicationContext.getBean("userMapper", UserMapper.class);
        System.out.println(userMapper.findUserById(1));
    }
    
}
