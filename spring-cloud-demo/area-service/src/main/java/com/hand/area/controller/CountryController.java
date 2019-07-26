package com.hand.area.controller;

import com.hand.area.dao.CountryDao;
import com.hand.area.dao.CountryMapper;
import com.hand.area.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/area")
public class CountryController {

    @Autowired
    CountryDao countryDao;
    @Autowired
    CountryMapper countryMapper;
    @GetMapping("/select/{id}")
    public Country selectById(@PathVariable Integer id) throws Exception{
        Country country = new Country();
        country.setCountryId(id);
        System.out.println(countryDao.selectById(country));
        return countryDao.selectById(country);

    }
    @PostMapping("/insert")
    public String insert(@RequestBody Country country)
    {
        if(countryMapper.insertSelective(country)!=0)
        {
            return "插入国家成功";
        }
        else
        {
            return "插入国家失败";
        }
    }
}
