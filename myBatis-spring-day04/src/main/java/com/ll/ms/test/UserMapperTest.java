package com.ll.ms.test;

import com.ll.ms.dao.UserDao;
import com.ll.ms.mapper.UserMapper;
import com.ll.ms.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserMapperTest {

    private ApplicationContext ctx = null;

    @Before
    public void init(){
        ctx = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void testFindUserById() throws Exception {
        UserMapper mapper = ctx.getBean("userMapper", UserMapper.class);
        User user = mapper.findUserById(10);
        System.out.println(user);
    }

//    @Test
//    public void testFindAllUsers() throws Exception{
//        UserMapper mapper = ctx.getBean("userMapper",UserMapper.class);
//        List<User> allUsers = mapper.findAllUsers();
//        allUsers.forEach(System.out::println);
//    }


}
