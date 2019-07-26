package com.hand.countryservice.service.impl;

import com.hand.countryservice.dao.CountryMapper;
import com.hand.countryservice.domain.Country;
import com.hand.countryservice.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("countryService")
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Override
    public List<Country> findAll() {
        return countryMapper.findAll();
    }

    @Override
    public Country findById(Integer id) {
        return countryMapper.findById(id);
    }

    @Override
    public int save(Country country) {
        return countryMapper.save(country);
    }

    @Override
    public int deleteById(Integer id) {
        return countryMapper.deleteById(id);
    }

    @Override
    public int updateById(Country country) {
        return countryMapper.updateById(country);
    }
}
