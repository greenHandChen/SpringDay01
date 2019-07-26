package com.tlq.userservice.controller;

import com.tlq.userservice.enity.Country;
import com.tlq.userservice.feignService.CountryFeignService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.tlq.userservice.enity.Users;

import java.util.*;

/**
 * @Description: 用户微服务控制器
 * @Author: TanLinQuan
 * @Date: 2019/7/26 14:15
 * @Version: V1.0
 **/
@RestController
public class UserController {

    private static List<Users> USER_MAP = null;

    static {
        List<Users> userList = new LinkedList<>();

        userList.add(new Users(1L,
                                "one",
                                "1906595568@qq.com",
                                "男",
                                1L));
        userList.add(new Users(2L,
                                "two",
                                "1906595568@qq.com",
                                "男",
                                2L));
        userList.add(new Users(3L,
                        "two",
                        "1906595568@qq.com",
                        "男",
                        3L));
        USER_MAP = userList;
    }

    @Autowired
    private CountryFeignService countryFeignService;

    @GetMapping(value = "/users/{id}")
    public List<Users> userService(@PathVariable(value = "id")long id) {

        List<Users> usersList = new LinkedList<>();
        for (Users users : USER_MAP) {
            if (users.getId() == id) {
                Country country = countryFeignService.getCountries(id);
                users.setCountryName(country.getCountryName());
                usersList.add(users);
            }
        }
        return usersList;

    }


}
