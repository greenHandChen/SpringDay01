package com.hand.service;

import com.hand.pojo.Orders;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author dingwensheng
 * @description: 调用服务
 * @date 2019/7/2611:25
 */
//@Service
//@FeignClient(value = "spring-cloud-extrasmanager")
//public interface OrdersService {
//
//    @RequestMapping("/queryOrders")
//    public List<Orders> finOrders();
//}

    /*
    调用网关
     */
@Service
@FeignClient(value = "spring-cloud-zuul")
public interface OrdersService {

    @RequestMapping("/order/queryOrders")
    public List<Orders> finOrders();
}