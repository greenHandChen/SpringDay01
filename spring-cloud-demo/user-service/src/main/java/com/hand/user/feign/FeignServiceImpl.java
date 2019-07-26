package com.hand.user.feign;

import com.hand.user.entity.Country;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceImpl implements FeignService{
    @Override
    public Country select(Integer id) {
        Country country=new Country();
        country.setCountryName("error");
        return country;
    }

    @Override
    public String insert(Country country) {
        return "异常";
    }
}
