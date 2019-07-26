package com.example.areaserivce.controller;

import com.example.areaserivce.entity.Country;
import com.example.areaserivce.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AreaController {

    private final static Map<Long, Country> COUNTRY_MAP;

    static{
        Map<Long, Country> countryMap = new HashMap<>();
        Country c1 = new Country(1L,"中国");
        Country c2 = new Country(2L,"其它");
        countryMap.put(1L, c1);
        countryMap.put(2L, c2);
        COUNTRY_MAP = Collections.unmodifiableMap(countryMap);
    }

    @GetMapping("/country/{countryId}")
    public Country queryCountry(@PathVariable("countryId") long countryId) throws InterruptedException {
        Thread.sleep(3000);
        if(COUNTRY_MAP.containsKey(countryId)){
            return COUNTRY_MAP.get(countryId);
        }
        throw new RuntimeException("Country not found!");
    }

    @GetMapping("/user/{id}")
    public User queryCountry(@PathVariable("id") Integer id){

        User user = new User();
        return user;
    }

}
