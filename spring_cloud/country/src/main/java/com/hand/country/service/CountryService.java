package com.hand.country.service;

import com.hand.country.entity.Country;

import java.util.List;

public interface CountryService {

    List<Country> findAll();

    Country findCountryById(int id);
}
