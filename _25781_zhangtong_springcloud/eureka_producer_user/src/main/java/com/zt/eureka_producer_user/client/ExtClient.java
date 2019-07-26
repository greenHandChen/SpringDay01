package com.zt.eureka_producer_user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: 声明对eureka-producer-ext服务的定义和调用
 * @author: invokerZt
 * @date: 2019-07-26 10:48
 */
@FeignClient("eureka-producer-ext")
public interface ExtClient {

    @GetMapping("/eorders")
    String getOrdersByName(@RequestParam(name = "username", required = true, defaultValue = "invoker") String username);

    @GetMapping("/eorders/{id}")
    String getOrdersById(@PathVariable String id);

}
