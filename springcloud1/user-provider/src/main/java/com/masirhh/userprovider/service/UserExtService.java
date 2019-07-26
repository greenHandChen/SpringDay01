package com.masirhh.userprovider.service;

import com.masirhh.countryprovider.beans.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "country-server")
public interface UserExtService {
    @GetMapping("/country/{id}")
    Country findCountryById(@PathVariable("id") Integer id);

}
