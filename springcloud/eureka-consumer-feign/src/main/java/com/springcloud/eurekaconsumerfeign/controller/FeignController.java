package com.springcloud.eurekaconsumerfeign.controller;

import com.springcloud.eurekaconsumerfeign.feign.ClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private ClientFeign clientFeign;

    @GetMapping("/consumer")
    public String conSay(){
        String str = clientFeign.say();
        return str+"  <{[-]}><[{+}]>";
    }

}
