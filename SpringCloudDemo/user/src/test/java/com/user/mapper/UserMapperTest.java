package com.user.mapper;

import com.user.UserApplicationTests;
import com.user.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by wangjie_fourth on 2019/7/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserMapperTest{

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getUser() throws Exception {
        User user = userMapper.getUser(1);
        log.info("user={}",user);
        Assert.assertTrue( user != null);
    }

    @Test
    public void insertUser(){
        User user = new User();
        user.setSex("1");
        user.setAddress("新的地址");
        user.setBirthday(new Date());
        user.setUserName("新的名称");

        Integer result = userMapper.insertUser(user);
        log.info("result={}",result);
    }

    @Test
    public void updateUser(){
        User user = new User();
        user.setId(32);
        user.setSex("0");
        user.setAddress("更新的地址");
        user.setBirthday(new Date());
        user.setUserName("更新的名称");

        Integer result = userMapper.updateUser(user);
        log.info("result={}",result);
    }

    @Test
    public void deleteUserById(){
        Integer result = userMapper.deleteUserById(32);
        log.info("result={}",result);
    }

}