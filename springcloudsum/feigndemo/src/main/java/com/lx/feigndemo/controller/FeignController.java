package com.lx.feigndemo.controller;

import com.lx.feigndemo.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    @RequestMapping("/feign/select")
    public String select(Integer id){
        return feignService.select(id);
    }
}
