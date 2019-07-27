package com.hand.user_service.controller;

import com.hand.user_service.entity.Country;
import com.hand.user_service.entity.User;
import com.hand.user_service.feign.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/user")
public class FeignController {
    private static final List<User> USER_LIST;
    static {
        List<User> userList = new ArrayList<>();
        userList.add(new User()
                .setId(1L)
                .setUsername("User 03")
                .setSex("男")
                .setEmail("user03@demo.com")
                .setCountryId(1L));
                userList.add(new User()
                .setId(2L)
                .setUsername("User 04")
                .setSex("女")
                .setEmail("user04@demo.com")
                .setCountryId(2L));
        userList.add(new User()
                .setId(3L)
                .setUsername("User 03")
                .setSex("男")
                .setEmail("user03@demo.com")
                .setCountryId(3L));
        USER_LIST= Collections.unmodifiableList(userList);
    }
    private CountryService countryService;
    @Autowired

    public FeignController(CountryService countryService){
        this.countryService=countryService;
    }
    @GetMapping("/feign")
    public List<User> queryUser(){
        List<User> userList=new ArrayList<>(USER_LIST);
        userList.forEach(user->{
            Country country=countryService.queryCountry(user.getCountryId());
            user.setCountryName(country.getCountryName());

        });
        return  userList;
    }
}
