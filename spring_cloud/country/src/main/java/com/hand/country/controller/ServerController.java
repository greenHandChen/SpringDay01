package com.hand.country.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:Ervin
 * @date:2019/7/26
 * @description:
 **/
@RestController
public class ServerController {

    @RequestMapping(value="/msg")
    public String msg(){
        return "servercontroller";
    }
}
