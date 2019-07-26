package com.masirhh.countryprovider.service;

import com.masirhh.countryprovider.beans.Country;

import java.util.List;

public interface CountryService {
    List<Country> findAll();

    Country findCountryById(Integer id);

    void addCountry(Country country);

    void updateCountry(Country country);

    void deleteCountry(Integer id);
}
