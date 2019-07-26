package com.lhb.service2.feign.failback;

import com.lhb.service2.entity.Country;
import com.lhb.service2.feign.CountryService;

/**
 * Created By LHB on 2019/7/26;
 */
public class CountryServiceImpl implements CountryService {
    private static  final Country ERROR=new Country().setCountryName("ERROR");

    @Override
    public Country queryCountry(Long countryId) {
        return ERROR;
    }
}
