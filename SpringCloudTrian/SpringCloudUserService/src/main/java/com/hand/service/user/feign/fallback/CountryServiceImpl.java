package com.hand.service.user.feign.fallback;

import com.hand.service.user.feign.CountryService;
import com.hand.service.user.pojo.Country;
import org.springframework.stereotype.Component;

/**
 * @Author: 王俊
 * @Date: 2019/7/26 18:06
 **/
@Component
public class CountryServiceImpl implements CountryService {
    @Override
    public Country getCountry(Integer id) {
        Country country=new Country();
        country.setCountryName("Error Country");
        return country;
    }
}
