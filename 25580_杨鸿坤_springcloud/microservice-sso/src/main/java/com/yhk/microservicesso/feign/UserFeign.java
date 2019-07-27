package com.yhk.microservicesso.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microseservice-user")
public interface UserFeign {

    @GetMapping("/findUser/{id}")
    String findUser(@PathVariable("id") Integer id);

    @GetMapping("/test")
    String test();
}
