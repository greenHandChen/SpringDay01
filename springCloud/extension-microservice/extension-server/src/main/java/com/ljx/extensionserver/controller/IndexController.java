package com.ljx.extensionserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LinJianXiong
 * @Date 2019/7/26
 * @Time 14:06
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/toUser")
    public String toUser(){
        return "我是来自扩展服务的数据";
    }
}
