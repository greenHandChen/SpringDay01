package com.jmx.feignconsumer;

import model.UserDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:
 * @Date:created in
 * @Description:
 */
@RestController
@EnableAutoConfiguration
public class FeignController {
    @Autowired
    private IFeignService iFeignService;
    @RequestMapping("feign/test")
    public String testFeign(){
            return iFeignService.test();
    }

    @RequestMapping(value="feign/addUser")
    public String insertUser(){
        UserDemo userDemo=new UserDemo();
        userDemo.setUserId(17L);
        userDemo.setUserName("小江");
        userDemo.setUserSex("男");
        System.out.println("999");
        return iFeignService.insertUser(userDemo);
    }
    @RequestMapping("feign/queryUser")
    public String query(){
        return iFeignService.queryUser();
    }
     @RequestMapping("feign/queryUserList")
    public List<UserDemo> queryUserList(){
        return iFeignService.queryUserList();
     }

}
