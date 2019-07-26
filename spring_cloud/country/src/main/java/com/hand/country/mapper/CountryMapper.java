package com.hand.country.mapper;

import com.hand.country.entity.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CountryMapper {

    List<Country> findAll();

    Country findCountryById(int id);
}
