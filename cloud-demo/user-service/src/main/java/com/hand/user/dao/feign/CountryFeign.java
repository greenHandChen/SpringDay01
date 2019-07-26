package com.hand.user.dao.feign;

import com.hand.user.dao.feign.impl.CountryFeignImpl;
import com.hand.user.domain.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(value = "country-service", fallback = CountryFeignImpl.class)
public interface CountryFeign {

    @GetMapping("/country/findAll")
    List<Country> findAll();
    @GetMapping("/country/find/{id}")
    Country findById(@PathVariable("id") Integer id);
}
