package com.example.feigndemo.Controller;

import com.example.feigndemo.mapper.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName:DemoController
 * Author:Hejunfeng
 * Date:2019/7/24 10:57
 */
@RestController
public class DemoController {
    @Resource
    private IDemoService demoService;
    @RequestMapping("/feign/demo")
    public String demo(@RequestParam("param")String param){
        return demoService.test(param);
    }


}