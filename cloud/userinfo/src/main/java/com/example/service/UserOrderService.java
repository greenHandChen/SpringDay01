package com.example.service;

import com.example.domain.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@FeignClient(value = "spring-cloud-userext")
@Component
public interface UserOrderService {
    @RequestMapping("/getOrder/{uid}")
    public List<Order> getOrderByUid(@PathVariable("uid") Integer uid);

    @RequestMapping("/addOrder/")
    public Integer addOrder( Order order);

}
