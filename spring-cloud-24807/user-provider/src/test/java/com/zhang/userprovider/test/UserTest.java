package com.zhang.userprovider.test;

import com.zhang.userprovider.controller.UserController;
import com.zhang.userprovider.feign.CountryFeignService;
import com.zhang.userprovider.pojo.User;
import com.zhang.userprovider.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * ClassName:UserTest
 * Author:ZhangChunjia
 * Date:2019/7/26 10:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserService userService;

    @Autowired(required = true)
    private CountryFeignService countryFeignService;

    @Autowired
    private UserController controller;

    @Test
    public void test1() {
        List<User> list = userService.getAllUsers();
        for (User user : list) {
            System.out.println(user);
        }
    }

//    @Test
//    public void userExtrInfo() {
//        User user=new User();
//        user.setCountry_id(1);
//        System.out.println(controller.userExtrInfo(user.getCountry_id()));
//
////        System.out.println(countryFeignService.findCountryById(1));
//    }
}
