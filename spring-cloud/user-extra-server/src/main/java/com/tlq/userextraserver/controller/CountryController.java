package com.tlq.userextraserver.controller;

import com.tlq.userextraserver.enity.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @Description: 城市微服务控制器
 * @Author: TanLinQuan
 * @Date: 2019/7/26 15:16
 * @Version: V1.0
 **/
@RestController
public class CountryController {

    private static final Map<Long, Country> COUNTRY_MAP;

    static {
        Map<Long, Country> countryMap = new HashMap<>();
        countryMap.put(1L, new Country(1L,"湛江"));
        countryMap.put(2L, new Country(2L,"广州"));
        COUNTRY_MAP = Collections.unmodifiableMap(countryMap);
    }

    @GetMapping(value = "/country/{countryId}")
    public Country getCountries(@PathVariable(value = "countryId") long countryId) throws InterruptedException {
        Thread.sleep(100000);
        if (COUNTRY_MAP.containsKey(countryId)) {
            return COUNTRY_MAP.get(countryId);
        }
        throw new RuntimeException("Country not found!");
    }
}
