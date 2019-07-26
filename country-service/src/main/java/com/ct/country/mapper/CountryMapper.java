package com.ct.country.mapper;

import com.ct.country.domain.Country;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ct478
 * @date 2019/7/26 0026
 */
@Repository
public interface CountryMapper {
    void add(String countryName);
    Integer delete(Long countryId);
    List<Country> query(Country country);
    Integer update(Country country);
}
