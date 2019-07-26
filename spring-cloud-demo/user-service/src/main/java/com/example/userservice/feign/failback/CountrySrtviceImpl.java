package com.example.userservice.feign.failback;

import com.example.userservice.entity.Country;
import com.example.userservice.entity.User;
import com.example.userservice.feign.CountryService;
import org.springframework.stereotype.Component;

@Component
public class CountrySrtviceImpl implements CountryService {
    private static final Country ERROR = new Country()
            .setCountryName("ERROR");

    @Override
    public Country queryCountry(Long countryId) {
        return ERROR;
    }

    @Override
    public User queryUserById(Integer id) {
        return null;
    }
}
