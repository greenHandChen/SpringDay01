package com.hand.countryservice.service;

import com.hand.countryservice.domain.Country;

import java.util.List;

public interface CountryService {
    List<Country> findAll();
    Country findById(Integer id);
    int save(Country country);
    int deleteById(Integer id);
    int updateById(Country country);
}
