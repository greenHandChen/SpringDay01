package com.masirhh.countryprovider.controller;

import com.masirhh.countryprovider.beans.Country;
import com.masirhh.countryprovider.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/country")
    public List<Country> findAll(){
        return countryService.findAll();
    }

    @GetMapping("/country/{id}")
    public Country findCountryById(@PathVariable("id") Integer id){
        return countryService.findCountryById(id);
    }

    @PostMapping("/country/addcountry")
    public void addCountry(Country country)
    {
        countryService.addCountry(country);
    }

    @PutMapping("/country")
    public void updateCountry(Country country){
        countryService.updateCountry(country);
    }

    @DeleteMapping("/country")
    public void deleteCountry(Integer id){
        countryService.deleteCountry(id);
    }

}
