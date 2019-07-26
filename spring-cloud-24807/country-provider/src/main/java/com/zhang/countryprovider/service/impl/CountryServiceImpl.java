package com.zhang.countryprovider.service.impl;

import com.zhang.countryprovider.dao.CountryDao;
import com.zhang.countryprovider.pojo.Country;
import com.zhang.countryprovider.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:CountryServiceImpl
 * Author:ZhangChunjia
 * Date:2019/7/26 11:49
 */
@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDao countryDao;
    @Override
    public Country findCountryById(Integer id) {

        return countryDao.findCountryById(id);
    }

    @Override
    public void addCountry(Country country) {
        countryDao.addCountry(country);
    }

    @Override
    public void deleteCountry(Country country) {
        countryDao.deleteCountry(country);
    }

    @Override
    public void updateCountry(Country country) {
        countryDao.updateCountry(country);
    }

    @Override
    public List<Country> showCountry() {
        return countryDao.showCountry();
    }
}
