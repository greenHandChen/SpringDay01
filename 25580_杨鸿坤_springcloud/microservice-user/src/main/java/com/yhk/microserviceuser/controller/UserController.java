package com.yhk.microserviceuser.controller;

import com.yhk.microserviceuser.pojo.User;
import com.yhk.microserviceuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    /**
     * 根据ID查询用户
     */
    @RequestMapping("/findUser")
    public ModelAndView findUser(Integer id){
        User user = userService.findUser(id);
        ModelAndView mv=new ModelAndView();
        mv.addObject(user);
        mv.setViewName("upUser");
        return  mv;
    }

    @GetMapping("/findAll")
    public ModelAndView findAllUser(){
        List<User> allUser = userService.findAllUser();
        ModelAndView mv=new ModelAndView();
        mv.addObject("user",allUser);
        mv.setViewName("showUser");
        return  mv;
    }

    /**
     * 添加用户
     */
    @RequestMapping("/input")
    public ModelAndView showPage(User user){ //解决th:arrors中没有User对象的异常
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("input");
        return modelAndView;
    }
    @RequestMapping("/insertUser")
    public String insertUser(User user){
        userService.insertUser(user);
        return "添加成功";
    }

    @RequestMapping("/showuser")
    public ModelAndView showuser(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("showUser");
        return modelAndView;
    }
    /**
     * 更新用户
     * @param user
     * @return
     */
    @RequestMapping("/upUser")
    public String upUser(User user){
        int i = userService.upUser(user);
        if(i!=1){
            return "失败";
        }
        return  "更新成功";
    }
    /**
     * 删除用户
     */
    @RequestMapping("/delUser")
    public String delUser(User user){
        int i = userService.delUser(user);
        return "删除成功";
    }

}
