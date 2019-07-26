package com.example.userservice.controller;

import com.example.userservice.entity.Country;
import com.example.userservice.entity.User;
import com.example.userservice.feign.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/user")
@SuppressWarnings("all")
public class FeignController {

//    private final static Logger logger = LoggerFactory.getLogger(RestTemplateController.class);
    private final static List<User> USER_LIST;

    static{
        List<User> userList = new ArrayList<>();
        User u1 = new User();
        u1.setId(1);
        u1.setUsername("User 03");
        u1.setSex("男");
        u1.setEmail("user03@demo.com");
        u1.setCountryId(1L);

        User u2 = new User();
        u2.setId(2);
        u2.setUsername("User 04");
        u2.setSex("女");
        u2.setEmail("user04@demo.com");
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
        USER_LIST = Collections.unmodifiableList(userList);
    }

    private CountryService countryService;

    @Autowired
    public FeignController(CountryService countryService){
        this.countryService = countryService;
    }

    @GetMapping("/feign")
    public List<User> queryUser(){
        List<User> userList = new ArrayList<>(USER_LIST);
        userList.forEach(user -> {
            try{
                Country country = countryService.queryCountry(user.getCountryId());
                user.setCountryName(country.getCountryName());
            }catch(RestClientException e){
                e.printStackTrace();
            }
        });
        return userList;
    }

    @GetMapping("/feignUser")
    public User queryUserById(Integer id){
        User user = countryService.queryUserById(id);
        return user;
    }
}
