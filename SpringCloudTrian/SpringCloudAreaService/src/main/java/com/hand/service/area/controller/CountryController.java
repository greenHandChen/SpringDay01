package com.hand.service.area.controller;

import com.hand.service.area.pojo.Country;
import com.hand.service.area.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 王俊
 * @Date: 2019/7/26 16:28
 **/
@RestController
public class CountryController {
    private CountryService countryService;

    @Autowired
    public void setCountryService(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/list")
    public List<Country> findAll() {
        return countryService.findAll();
    }

    @GetMapping("/country/{id}")
    public Country findById(@PathVariable Integer id) {
        return countryService.findById(id);
    }

    @PostMapping("/country")
    public int add(Country country) {
        return countryService.add(country);
    }

    @DeleteMapping("/country/{id}")
    public int delete(@PathVariable Integer id) {
        return countryService.delete(id);
    }

    @PutMapping("/country")
    public int update(Country country) {
        return countryService.update(country);
    }
}
