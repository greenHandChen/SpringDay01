package com.hand.user.client;

import com.hand.user.entity.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:Ervin
 * @date:2019/7/26
 * @description:
 **/
@FeignClient(name = "country")
//@RequestMapping(value = "/country")
public interface CountryClient {

    @RequestMapping(value = "/msg")
    String userMsg();

    @RequestMapping(value = "/country/findCountryById/{countryId}")
    Country findCountryById(@PathVariable(name = "countryId") int countryId);

}
