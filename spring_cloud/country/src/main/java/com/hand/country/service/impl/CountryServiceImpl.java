package com.hand.country.service.impl;

import com.hand.country.entity.Country;
import com.hand.country.mapper.CountryMapper;
import com.hand.country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:Ervin
 * @date:2019/7/26
 * @description:
 **/

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryMapper countryMapper;


    @Override
    public List<Country> findAll() {
        return countryMapper.findAll();
    }

    @Override
    public Country findCountryById(int id) {
        return countryMapper.findCountryById(id);
    }
}
