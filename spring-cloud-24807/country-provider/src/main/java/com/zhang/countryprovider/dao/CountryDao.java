package com.zhang.countryprovider.dao;

import com.zhang.countryprovider.pojo.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CountryDao {

    Country findCountryById(Integer id);

    void addCountry(Country country);

    void deleteCountry(Country country);

    void updateCountry(Country country);

    List<Country> showCountry();
}
