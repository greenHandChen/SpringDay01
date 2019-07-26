package com.hand.country.controller;

import com.hand.country.entity.Country;
import com.hand.country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:Ervin
 * @date:2019/7/26
 * @description:
 **/

@RestController
@RequestMapping(value = "/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @RequestMapping(value = "/allCountry")
    public List<Country> allCountry(){
        List<Country> list = countryService.findAll();
        return list;
    }

    @RequestMapping(value = "/findCountryById/{countryId}")
    public Country findCountryById(@PathVariable(name = "countryId") int countryId){
        return countryService.findCountryById(countryId);
    }


}
