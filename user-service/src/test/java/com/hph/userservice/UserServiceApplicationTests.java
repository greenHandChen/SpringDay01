package com.hph.userservice;

import com.hph.userservice.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
        System.out.println(userDao.findById(1).get());
    }

}
