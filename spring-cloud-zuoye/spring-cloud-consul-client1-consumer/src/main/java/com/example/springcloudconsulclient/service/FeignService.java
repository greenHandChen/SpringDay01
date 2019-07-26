package com.example.springcloudconsulclient.service;

import com.example.springcloudconsulclient.bean.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("spring-cloud-consul-feign")
public interface FeignService {
    @PostMapping("/queryother")
    public List<Orders> findUserOtherInfo(@RequestBody Orders orders);

    @PostMapping("/insertotherinfo")
    public boolean insertOtherInfo(Orders orders);

    @PostMapping("/deleteotherinfo")
    public boolean deleteOtherInfo(Orders orders);

    @PostMapping("/updateotherinfo")
    public boolean updateOtherInfo(Orders orders);

}
