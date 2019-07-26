package com.example.userservice.feign;

import com.example.userservice.entity.Country;
import com.example.userservice.entity.User;
import com.example.userservice.feign.failback.CountrySrtviceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "area-service",fallback = CountrySrtviceImpl.class)
public interface CountryService {

    @GetMapping("/country/{countryId}")
    Country queryCountry(@PathVariable("countryId") Long countryId);

    @GetMapping("/user/{id}")
    User queryUserById(@PathVariable("id") Integer id);
}
