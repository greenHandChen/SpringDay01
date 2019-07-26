package com.hand.service.user.controller;

import com.hand.service.user.feign.CountryService;
import com.hand.service.user.pojo.Country;
import com.hand.service.user.pojo.User;
import com.hand.service.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 王俊
 * @Date: 2019/7/26 15:29
 **/
@RestController
public class UserController {

    private UserService userService;
    private CountryService countryService;

    @Autowired
    public void setCountryService(CountryService countryService) {
        this.countryService = countryService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public List<User> list() {
        List<User> userList = userService.findAll();
        userList.forEach(user -> {
            Country country = countryService.getCountry(user.getCountryId());
            user.setCountryName(country.getCountryName());
        });
        return userList;
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Integer id) {
        User user = userService.findById(id);
        Country country = countryService.getCountry(user.getCountryId());
        user.setCountryName(country.getCountryName());
        return user;
    }

    @PostMapping("/user")
    public Integer add(User user) {
        return userService.add(user);
    }

    @PutMapping("/user")
    public Integer update(User user) {
        return userService.update(user);
    }

    @DeleteMapping("/user/{id}")
    public Integer delete(@PathVariable Integer id) {
        return userService.delete(id);
    }
}
