package com.hand.service.user.feign;

import com.hand.service.user.feign.fallback.CountryServiceImpl;
import com.hand.service.user.pojo.Country;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: 王俊
 * @Date: 2019/7/26 16:58
 **/
@FeignClient(name = "area-service", fallback = CountryServiceImpl.class)
public interface CountryService {
    @GetMapping("/country/{id}")
    Country getCountry(@PathVariable("id") Integer id);
}
