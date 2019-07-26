package com.example.userservice.controller;

import com.example.userservice.entity.Country;
import com.example.userservice.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/user")
public class RestTemplateController {
    private final static Logger logger = LoggerFactory.getLogger(RestTemplateController.class);
    private final static List<User> USER_LIST;

    static{
        List<User> userList = new ArrayList<>();
        User u1 = new User();
        u1.setId(1);
        u1.setUsername("User 01");
        u1.setSex("男");
        u1.setEmail("user01@demo.com");
        u1.setCountryId(1L);

        User u2 = new User();
        u2.setId(2);
        u2.setUsername("User 02");
        u2.setSex("女");
        u2.setEmail("user02@demo.com");
        u2.setCountryId(2L);
        userList.add(u1);
        userList.add(u2);
        USER_LIST = Collections.unmodifiableList(userList);
    }

    private RestTemplate restTemplate;

    @Autowired
    public RestTemplateController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @GetMapping("/rest-template")
    public List<User> queryUser(){
        List<User> userList = new ArrayList<>();
        User u1 = new User();
        u1.setId(1);
        u1.setUsername("User 01");
        u1.setSex("男");
        u1.setEmail("user01@demo.com");
        u1.setCountryId(1L);

        User u2 = new User();
        u2.setId(2);
        u2.setUsername("User 02");
        u2.setSex("女");
        u2.setEmail("user02@demo.com");
        u2.setCountryId(2L);

        User u3 = new User();
        u3.setId(3);
        u3.setUsername("User 03");
        u3.setSex("女");
        u3.setEmail("user03@demo.com");
        u3.setCountryId(3L);
//        userList.add(u1);
//        userList.add(u2);
        userList.add(u3);
        userList.forEach(user -> {
            try{
                Country country = restTemplate.getForObject("http://area-service/country/{countryId}",
                        Country.class,
                        user.getCountryId());
                user.setCountryName(country.getCountryName());
            }catch(RestClientException e){
                e.printStackTrace();
            }
        });
        return userList;
    }

}
