package com.tlq.userservice.feignService.impl;

import com.tlq.userservice.enity.Country;
import com.tlq.userservice.feignService.CountryFeignService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description:
 * @Author: TanLinQuan
 * @Date: 2019/7/26 15:35
 * @Version: V1.0
 **/
@Component
public class CountryFeignServiceImpl implements CountryFeignService {
    private static final  Country countries = new Country();

    static {
        countries.setCountryName("ERROR");
    }

    @Override
    public Country getCountries(long countryId) {
        return countries;
    }
}
