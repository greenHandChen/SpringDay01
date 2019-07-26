package com.hand.countryservice.dao;

import com.hand.countryservice.domain.Country;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryMapper {
    List<Country> findAll();
    Country findById(Integer id);
    int save(Country country);
    int deleteById(Integer id);
    int updateById(Country country);
}
