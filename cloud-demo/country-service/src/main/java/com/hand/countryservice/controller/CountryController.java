package com.hand.countryservice.controller;

import com.hand.countryservice.domain.Country;
import com.hand.countryservice.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/findAll")
    public List<Country> findAll(){
        return countryService.findAll();
    }

    @GetMapping("/find/{id}")
    public Country findById(@PathVariable Integer id){
        return countryService.findById(id);
    }

    @PostMapping("/save")
    public int save(Country country){
        return countryService.save(country);
    }

    @GetMapping("/delete/{id}")
    public int deleteById(@PathVariable Integer id){
        return countryService.deleteById(id);
    }

    @PostMapping("/update")
    public int update(Country country){
        return countryService.updateById(country);
    }
}
