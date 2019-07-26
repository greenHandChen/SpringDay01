package com.hand.user;

import com.hand.user.entity.User;
import com.hand.user.mapper.UserMapper;
import com.hand.user.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApplicationTests {


    @Test
    public void contextLoads() {
    }


    @Autowired
    private UserMapper userMapper;
    @Test
    public void testUserMapper(){
        List<User> list = userMapper.findAll();
        Assert.assertTrue(list.size()>0);
    }


    @Autowired
    UserService userService;
    @Test
    public void testUserService(){
        List<User> list = userMapper.findAll();
        Assert.assertTrue(list.size()>0);
    }

}
