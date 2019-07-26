package com.example.springcloudconsul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConsulController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello consul";
    }

}
