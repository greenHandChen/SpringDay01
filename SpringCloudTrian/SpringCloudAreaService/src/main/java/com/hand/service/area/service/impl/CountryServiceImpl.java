package com.hand.service.area.service.impl;

import com.hand.service.area.dao.CountryDao;
import com.hand.service.area.pojo.Country;
import com.hand.service.area.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 王俊
 * @Date: 2019/7/26 16:25
 **/
@Service
public class CountryServiceImpl implements CountryService {
    private CountryDao countryDao;
    @Autowired
    public void setCountryDao(CountryDao countryDao) {
        this.countryDao = countryDao;
    }

    @Override
    public List<Country> findAll() {
        return countryDao.findAll();
    }

    @Override
    public Country findById(Integer id) {
        return countryDao.findById(id);
    }

    @Override
    public int add(Country country) {
        return countryDao.add(country);
    }

    @Override
    public int delete(Integer id) {
        return countryDao.delete(id);
    }

    @Override
    public int update(Country country) {
        return countryDao.update(country);
    }
}
