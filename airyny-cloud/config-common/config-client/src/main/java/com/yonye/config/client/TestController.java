package com.yonye.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:Yonye
 * @Date:2019/7/25 23:22
 * @Version:1.0
 * @deseription:
 **/
@RestController
public class TestController {
    @Value("${userName}")
    private String userName;

    @Value("${idol}")
    private String idol;

    @Value("${book}")
    private String book;


    @RequestMapping("/getUserName")
    public String getUserName(){
        return userName;
    }

    @RequestMapping("/getIdol")
    public String getIdol(){
        return idol;
    }

    @RequestMapping("/getBook")
    public String getBook(){
        return book;
    }
}
