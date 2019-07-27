package com.hand.user_service.feign.failback;


import com.hand.user_service.entity.Country;
import com.hand.user_service.feign.CountryService;
import org.springframework.stereotype.Component;

@Component
public class CountryServiceImpl implements CountryService {
    private static final Country ERROR = new Country()
            .setCountryName("ERROR");

    @Override
    public Country queryCountry(Long countryId) {
        return ERROR;
    }
}
