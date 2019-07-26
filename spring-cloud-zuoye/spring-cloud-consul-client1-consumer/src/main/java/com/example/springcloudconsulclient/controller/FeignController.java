package com.example.springcloudconsulclient.controller;

import com.example.springcloudconsulclient.bean.Orders;
import com.example.springcloudconsulclient.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    FeignService feignService;
    @PostMapping("/queryother")
    public List<Orders> findUserOtherInfo(Orders orders){

        return feignService.findUserOtherInfo(orders);
    }

    @PostMapping("/insertotherinfo")
    public boolean insertOtherInfo(Orders orders){
        return feignService.insertOtherInfo(orders);
    }

    @PostMapping("/deleteotherinfo")
    public boolean deleteOtherInfo(Orders orders){
        return feignService.deleteOtherInfo(orders);
    }

    @PostMapping("/updateotherinfo")
    public boolean updateOtherInfo(Orders orders){
        return feignService.updateOtherInfo(orders);
    }
}
