package com.springbootdemo.controller;

import com.hand.springbootstaterhello.HelloService;
import com.springbootdemo.dto.UserDemo;
import com.springbootdemo.service.IUserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@EnableAutoConfiguration
public class UserDemoController {

    @Autowired
    private IUserDemoService userDemoService;

    @RequestMapping(value = "/query")
    public List<UserDemo> queryUserAll(){
        return userDemoService.queryUserDemo();
    }

    @RequestMapping("testHtml")
    public ModelAndView testHtml(){
        ModelAndView modelAndView = new ModelAndView();
        List<UserDemo> list= userDemoService.queryUserDemo();
        modelAndView.getModel().put("testList",list);
        modelAndView.setViewName("test");
        return modelAndView;
    }
}
