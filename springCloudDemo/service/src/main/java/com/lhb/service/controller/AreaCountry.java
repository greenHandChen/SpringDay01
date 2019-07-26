package com.lhb.service.controller;

import com.lhb.service.entity.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created By LHB on 2019/7/26;
 */
@RestController
public class AreaCountry {

    private static final Map<Long ,Country> COUNTRY_MAP;

    static {
        Map<Long,Country> countryMap=new HashMap<>();
        countryMap.put(1L,new Country().setCountryId(1L).setCountryName("中国"));
        countryMap.put(2L,new Country().setCountryId(2L).setCountryName("其他"));
        COUNTRY_MAP= Collections.unmodifiableMap(countryMap);
    }



    @GetMapping("/country/{countryId}")
    public Country queryCountry(@PathVariable Long countryId){
        if (COUNTRY_MAP.containsKey(countryId)){
            return COUNTRY_MAP.get(countryId);
        }
        throw new RuntimeException("Country not found!");
    }

}













