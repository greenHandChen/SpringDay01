package com.hand.user_service.feign;

import com.hand.user_service.entity.Country;
import com.hand.user_service.feign.failback.CountryServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//name值就是所要匹配的服务的名称
@FeignClient(name = "area-service",fallback = CountryServiceImpl.class)
public interface CountryService {
    @GetMapping("/country/{countryId}")
    Country queryCountry(@PathVariable(name = "countryId") Long countryId);

}
