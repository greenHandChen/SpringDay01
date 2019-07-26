package com.example.userservice.controller;

import com.example.userservice.domain.AdditionInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "addtioninfoservice")
public interface AdditionalInfoClient {

    @RequestMapping(method = RequestMethod.GET,value = "/addtioninfo/{id}")
    String getAdditionInfo(  @RequestParam(value = "id") Integer id);

    @RequestMapping(method = RequestMethod.DELETE,value="{id}")
    String del(@PathVariable(value = "id") Integer id);

    @RequestMapping(method = RequestMethod.PUT)
    String add(@RequestBody AdditionInfo additionInfo);

    @RequestMapping(method = RequestMethod.POST)
    String update(@RequestBody AdditionInfo additionInfo);



}
