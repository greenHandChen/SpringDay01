package com.example.springcloudconsulclient.service;

import com.example.springcloudconsulclient.bean.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient("spring-cloud-consul-feign")
public interface FeignService {
    @PostMapping("/queryother")
    public List<Orders> findUserOtherInfo(Orders orders);

    @PostMapping("/insertotherinfo")
    public boolean insertOtherInfo(Orders orders);

    @PostMapping("/deleteotherinfo")
    public boolean deleteOtherInfo(Orders orders);

    @PostMapping("/updateotherinfo")
    public boolean updateOtherInfo(Orders orders);

}
