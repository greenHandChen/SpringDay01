package com.lhb.service2.controller;


import com.lhb.service2.entity.Country;
import com.lhb.service2.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


/**
 * Created By LHB on 2019/7/26;
 */
@RestController
@RequestMapping("/user")
public class RestTemplateController {
    private static final Logger logger=LoggerFactory.getLogger(RestTemplateController.class);
    private static final List<User> USER_LIST;

    static{
        List<User> userList=new ArrayList<>();
        userList.add(new User()
                .setId(1L)
                .setUsername("张三")
                .setSex("男")
                .setEmail("user01@demo.com")
                .setCountryId(1L));
        userList.add(new User()
                .setId(2L)
                .setUsername("李四")
                .setSex("女")
                .setEmail("user02@demo.com")
                .setCountryId(2L));
//        userList.add(new User()
//                .setId(3L)
//                .setUsername("王五")
//                .setSex("男")
//                .setEmail("user03@demo.com")
//                .setCountryId(3L));

        USER_LIST=userList;
    }

    private RestTemplate restTemplate;

    @Autowired
    private RestTemplateController(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }
    @GetMapping("rest-template")
    public List<User> queryUser(){
        List<User> userList=new ArrayList<>(USER_LIST);
        userList.forEach(user -> {
            Country country=restTemplate.getForObject("http://service/country/{countryId}",
                    Country.class,
                    user.getCountryId());
            user.setCountryName(country.getCountryName());
        });
        return userList;
    }
}
