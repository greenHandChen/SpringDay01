package com.ct.country.controller;

import com.ct.country.domain.Country;
import com.ct.country.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ct478
 * @date 2019/7/26 0026
 */
@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryMapper countryMapper;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(String countryName) {
        countryMapper.add(countryName);
        return "success";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long countryId) {
        Integer rows = countryMapper.delete(countryId);
        return "delete success, affected " + rows + " rows";
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<Country> query(Long countryId, String countryName) {
        Country country = new Country();
        country.setCountryId(countryId);
        country.setCountryName(countryName);
        return countryMapper.query(country);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(Long countryId, String countryName) {
        Country country = new Country();
        country.setCountryId(countryId);
        country.setCountryName(countryName);
        Integer rows = countryMapper.update(country);
        return "update success, affected " + rows + " rows";
    }
}
