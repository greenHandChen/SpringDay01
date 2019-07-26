package com.lhb.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By LHB on 2019/7/22;
 */
@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String Hello(){
        return "hello,SpringCould";
    }
}
