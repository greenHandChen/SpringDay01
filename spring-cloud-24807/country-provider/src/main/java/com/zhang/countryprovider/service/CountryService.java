package com.zhang.countryprovider.service;

import com.zhang.countryprovider.pojo.Country;

import java.util.List;

/**
 * ClassName:CountryService
 * Author:ZhangChunjia
 * Date:2019/7/26 11:34
 */
public interface CountryService {
    Country findCountryById(Integer id);

    void addCountry(Country country);

    void deleteCountry(Country country);

    void updateCountry(Country country);

    List<Country> showCountry();
}
