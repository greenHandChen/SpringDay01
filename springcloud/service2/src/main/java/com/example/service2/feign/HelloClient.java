package com.example.service2.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name = "service")
public interface HelloClient {

    @RequestMapping(value = "/hello")
    public String hello();
}


