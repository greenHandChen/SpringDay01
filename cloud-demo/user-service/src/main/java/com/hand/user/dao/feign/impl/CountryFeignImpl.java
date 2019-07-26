package com.hand.user.dao.feign.impl;

import com.hand.user.dao.feign.CountryFeign;
import com.hand.user.domain.Country;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CountryFeignImpl implements CountryFeign {

    private Country error = new Country(-10,"erroe");

    @Override
    public List<Country> findAll() {
        return Arrays.asList(error);
    }

    @Override
    public Country findById(Integer id) {
        return error;
    }
}
