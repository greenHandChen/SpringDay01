package com.jmx.feignconsumer;

import model.UserDemo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value="spring-cloud-producer")
public interface IFeignService {
    @RequestMapping("/test")
     public String test();
    @RequestMapping(value="update/addUser",method =RequestMethod.POST )
    public String insertUser(@RequestBody UserDemo userDemo);
    @RequestMapping("query/queryUser")
    public String queryUser();

    @RequestMapping("query/queryUserList")
    public List<UserDemo> queryUserList();
}

