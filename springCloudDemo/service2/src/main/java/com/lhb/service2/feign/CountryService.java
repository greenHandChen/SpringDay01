package com.lhb.service2.feign;

import com.lhb.service2.entity.Country;
import com.lhb.service2.feign.failback.CountryServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created By LHB on 2019/7/26;
 */
@FeignClient(name = "service2", fallback = CountryServiceImpl.class)
public interface CountryService {
    @GetMapping("/country/{countryId}")
    Country queryCountry(@PathVariable(name = "countryId") Long countryId);
}
