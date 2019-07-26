package com.cloud.feigncustomer.controller;

import com.cloud.feigncustomer.interfaceforfeign.ICustomerUserService;
import com.cloud.feigncustomer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 控制消费UserService的控制器
 * @author: xueWu.Chen
 * @create: 2019-07-26
 **/
@RestController
@EnableAutoConfiguration
public class CustomerUserServiceController {
    @Autowired
    ICustomerUserService iCustomerUserService;
    /*
        查询接口
     */
    @RequestMapping(value = "/user/byName",method = RequestMethod.GET)
    public String getUserInfo(@RequestParam("name")String name){
        return iCustomerUserService.getUserByName(name);
    }

    /*
        删除数据接口
     */
    @RequestMapping(value = "/user/delUser",method = RequestMethod.GET)
    public String delUserInfoByName(@RequestParam("name")String name){
        return iCustomerUserService.delUserInfoByName(name);
    }

    @RequestMapping(value = "/user/insertUser")
    public String insertUser(){
        User user = new User();
        user.setName("刘武");
        user.setAge("23");
        user.setSex("男");
        user.setAddress("长江以南");
        return iCustomerUserService.insertUserInfo(user);
    }
}
