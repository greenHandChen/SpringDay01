package com.hand.area_service.controller;

import com.hand.area_service.entity.Country;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AreaController {
    private static  final Map<Long, Country> COUNTURY_MAP;
    static {
        Map<Long, Country> countryMap=new HashMap<>();
        countryMap.put(1L,new Country().setCountryId(1L).setCountryName("中国"));
        countryMap.put(2L,new Country().setCountryId(2L).setCountryName("其他"));
        COUNTURY_MAP= Collections.unmodifiableMap(countryMap);
    }
    @GetMapping("/country/{countryId}")
    private Country queryCountru(@PathVariable long countryId){
        if (COUNTURY_MAP.containsKey(countryId)){
            return COUNTURY_MAP.get(countryId);
        }
        throw  new RuntimeException("country not found!");
    }
}
