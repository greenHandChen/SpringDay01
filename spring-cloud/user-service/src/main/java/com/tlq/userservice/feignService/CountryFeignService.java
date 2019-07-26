package com.tlq.userservice.feignService;

import com.tlq.userservice.enity.Country;
import com.tlq.userservice.feignService.impl.CountryFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description: 城市微服务调度
 * @Author: TanLinQuan
 * @Date: 2019/7/26 15:33
 * @Version: V1.0
 **/
@FeignClient(value = "user-extra-server",fallback = CountryFeignServiceImpl.class)
public interface CountryFeignService {

    @GetMapping(value = "/countries/{countryId}")
    public Country getCountries(@PathVariable(value = "countryId") long countryId);
}
