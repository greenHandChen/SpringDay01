package com.lhb.service2.controller;

import com.lhb.service2.entity.Country;
import com.lhb.service2.entity.User;
import com.lhb.service2.feign.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By LHB on 2019/7/26;
 */
@RestController
@RequestMapping("/user")
public class FeignController {
    private static final List<User> USER_LIST;

    static{
        List<User> userList=new ArrayList<>();
        userList.add(new User()
                .setId(1L)
                .setUsername("张F三")
                .setSex("男")
                .setEmail("user01@demo.com")
                .setCountryId(1L));
        userList.add(new User()
                .setId(2L)
                .setUsername("李F四")
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

    private CountryService countryService;

public FeignController(CountryService countryService){
        this.countryService=countryService;
}
@GetMapping("/feign")
public List<User> queryUser(){
    List<User> userList= new ArrayList<>(USER_LIST);
    userList.forEach(user -> {
        Country country = countryService.queryCountry(user.getCountryId());
        user.setCountryName(country.getCountryName());
    });
    return userList;
}

}
