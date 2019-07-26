package com.ct.user.controller;

import com.ct.user.client.CountryClient;
import com.ct.user.domain.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author ct478
 * @date 2019/7/26 0026
 */
@RestController
public class CountryController {
    @Autowired
    private CountryClient countryClient;

    @RequestMapping(value = "/country/add", method = RequestMethod.POST)
    public String add(String countryName) {
        return countryClient.add(countryName);
    }

    @RequestMapping(value = "/country/delete/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long countryId) {
        return countryClient.delete(countryId);
    }

    //注意参数
    @RequestMapping(value = "/country/query", method = RequestMethod.GET)
    public List<Country> query(Long countryId, String countryName) {
        return countryClient.query(countryId, countryName);
    }

    @RequestMapping(value = "/country/update", method = RequestMethod.POST)
    public String update(Long countryId, String countryName) {
        return countryClient.update(countryId, countryName);
    }
}
