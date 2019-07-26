package com.hand.user.controller;

import com.hand.user.client.CountryClient;
import com.hand.user.entity.User;
import com.hand.user.entity.Country;
import com.hand.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author:Ervin
 * @date:2019/7/26
 * @description:
 **/
@RestController
public class ClientController {

    @Autowired
    private CountryClient countryClient;

    @RequestMapping(value = "/getCountryMsg")
    public String getCountryMsg(){
        String response = countryClient.userMsg();
        return  response;
    }


    @Autowired
    UserService userService;

    @RequestMapping(value = "/getCountryInfoByUserId/{userId}")
    public String getCountryInfoByUserId(@PathVariable int userId){
        User user = userService.findUserById(userId);
        Country country = countryClient.findCountryById(user.getCountryId());
        user.setCountryName(country.getCountryName());
        return user.toString();
    }

//    @RequestMapping(value = "/getCountryInfoByUserId")
//    public String getCountryInfoByUserId(){
//        Country country = countryClient.findCountryById(2);
//        return country.toString();

}
