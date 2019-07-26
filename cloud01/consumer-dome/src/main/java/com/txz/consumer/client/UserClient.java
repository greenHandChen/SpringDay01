package com.txz.consumer.client;

import com.txz.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("user-service")
public interface UserClient {

    @GetMapping("user/{id}")
    User queryById(@PathVariable("id")  Integer id);
}
