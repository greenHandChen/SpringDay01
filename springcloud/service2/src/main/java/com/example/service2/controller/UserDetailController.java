package com.example.service2.controller;

import com.example.service2.dto.UserDetail;
import com.example.service2.servicetwo.UserDetailServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserDetailController {

    @Resource
    private UserDetailServiceImpl service;

    @RequestMapping("/findOneDetail")
    public UserDetail findOne(Long id){
       return service.findById(id);
    }
    @RequestMapping("/findAllDetail")
    public List<UserDetail> findAll(){
        return service.findAll();
    }

    @RequestMapping("/addDetail")
    public String add(UserDetail userDetail){
        service.add(userDetail);
        return "insert ok";
    }
    @RequestMapping("/updateDetail")
    public String update(UserDetail userDetail){
        service.update(userDetail);
        return "update ok";
    }
    @RequestMapping("/deleteDetail")
    public String delete(Long id){
        service.delete(id);
        return "delete ok";
    }
}
