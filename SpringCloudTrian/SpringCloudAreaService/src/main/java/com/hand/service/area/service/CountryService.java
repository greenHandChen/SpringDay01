package com.hand.service.area.service;

import com.hand.service.area.pojo.Country;

import java.util.List;

/**
 * @Author: 王俊
 * @Date: 2019/7/26 16:24
 **/
public interface CountryService {
    List<Country> findAll();

    Country findById(Integer id);

    int add(Country country);

    int delete(Integer id);

    int update(Country country);
}
