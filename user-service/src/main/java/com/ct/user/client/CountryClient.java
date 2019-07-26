package com.ct.user.client;

import com.ct.user.client.CountryClientFallback;
import com.ct.user.domain.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author ct478
 * @date 2019/7/26 0026
 */
@FeignClient(value = "country-service", fallback = CountryClientFallback.class)
public interface CountryClient {
    //这里value对应的是country-service里的路径。。。之前错写成/add，浪费了一下午时间，re
    @RequestMapping(value = "/country/add", method = RequestMethod.POST)
    String add(String countryName);

    @RequestMapping(value = "/country/delete/{id}", method = RequestMethod.DELETE)
    String delete(@PathVariable("id") Long countryId);

    //注意参数
    @RequestMapping(value = "/country/query", method = RequestMethod.GET)
    List<Country> query(@RequestParam("countryId") Long countryId, @RequestParam("countryName") String countryName);

    @RequestMapping(value = "/country/update", method = RequestMethod.POST)
    String update(@RequestParam("countryId") Long countryId, @RequestParam("countryName") String countryName);
}
