package com.hjf.controller;

import com.hjf.pojo.UserDemo;
import com.hjf.service.UserDemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:UserDemoControl
 * Author:Hejunfeng
 * Date:2019/7/22 16:54
 */
@RestController
@RequestMapping(value = "/aa")
public class UserDemoControl {
    @Resource
    private UserDemoService userDemoService;

    @RequestMapping(value = "/query")
    public List<UserDemo> queryUserDemo(){
        return userDemoService.queryUserDemo();
    }

    @RequestMapping(value = "/demo1")
    public String demo(){
        return "demo";
    }

    @RequestMapping(value = "/testHtml")
    public ModelAndView testHtml(){
        ModelAndView mv = new ModelAndView();
        List<UserDemo> demoList=userDemoService.queryUserDemo();
        mv.getModel().put("testList",demoList);
        mv.setViewName("test");
        return  mv;
    }



}