package com.zhang.userprovider.feign;

import com.zhang.userprovider.pojo.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-countryService")
@Service("countryFeignService")
public interface CountryFeignService {

    @RequestMapping(value = "/findCountry", method = RequestMethod.GET)
    public String findCountry(@RequestParam(value = "id") Integer id);
}
