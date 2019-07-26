package com.masirhh.countryprovider.service;

import com.masirhh.countryprovider.beans.Country;
import com.masirhh.countryprovider.mappers.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CounutryServiceImpl implements CountryService {
    @Autowired
    CountryMapper countryMapper;

    @Override
    public List<Country> findAll() {
        return countryMapper.findAll();
    }

    public Country findCountryById(Integer id){
        return countryMapper.findCountryById(id);

    }

    @Override
    public void addCountry(Country country) {
        countryMapper.addCountry(country);
    }

    @Override
    public void updateCountry(Country country) {
        countryMapper.updateCountry(country);
    }

    @Override
    public void deleteCountry(Integer id) {
        countryMapper.deleteCountry(id);
    }
}
