package com.ljx.userserver.repository;

import com.ljx.userserver.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author LinJianXiong
 * @Date 2019/7/26
 * @Time 10:56
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void findByIdInTest() {
        List<User> byIdIn = userRepository.findByIdIn(Arrays.asList(1));
        Assert.assertTrue(byIdIn.size() > 0);

    }

    @Test
    public void findAllTest() {
    }

    @Test
    public void deleteByIdTest() {
    }
}