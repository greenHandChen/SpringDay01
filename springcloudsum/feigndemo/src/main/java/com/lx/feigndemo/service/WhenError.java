package com.lx.feigndemo.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

// 断路器
@Component
public class WhenError implements FeignService{
    @Override
    public String select(@RequestParam(value = "id") Integer id) {
        return "服务中断";
    }
}
