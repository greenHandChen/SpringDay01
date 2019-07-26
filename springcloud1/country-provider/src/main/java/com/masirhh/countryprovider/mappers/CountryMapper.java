package com.masirhh.countryprovider.mappers;


import com.masirhh.countryprovider.beans.Country;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryMapper {
    List<Country> findAll();

    Country findCountryById(Integer id);

    void addCountry(Country country);

    void updateCountry(Country country);

    void deleteCountry(Integer id);
}
