package com.lx.feigndemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "spring-cloud-producer", fallback = WhenError.class)
public interface FeignService {

    @RequestMapping("/select")
    String select(@RequestParam(value = "id") Integer id);
}
