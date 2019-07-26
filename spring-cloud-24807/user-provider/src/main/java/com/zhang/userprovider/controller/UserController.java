package com.zhang.userprovider.controller;

import com.alibaba.fastjson.JSON;
import com.zhang.userprovider.feign.CountryFeignService;
import com.zhang.userprovider.pojo.Country;
import com.zhang.userprovider.pojo.User;
import com.zhang.userprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

/**
 * ClassName:UserController
 * Author:ZhangChunjia
 * Date:2019/7/26 9:38
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired(required = true)
    private UserService userService;

    @Autowired(required = true)
    private CountryFeignService countryFeignService;

    @RequestMapping(value = "/getAllUsers")
    public ModelAndView getAllUsers() {
        ModelAndView modelAndView = new ModelAndView();
        List<User> userList = userService.getAllUsers();
        modelAndView.getModel().put("userList", userList);
        modelAndView.setViewName("allusers");

        return modelAndView;
    }

    @RequestMapping(value = "/addUser")
    public String addUser() {
        User user = new User();
        user.setUsername("xxxx");
        user.setAge(33);
        user.setAddress("不知道是哪里");
        userService.addUser(user);
        return "添加用户成功";
    }

    @RequestMapping(value = "/deleteUser")
    public String deleteUser(@RequestParam("id") Integer id) {
        userService.deleteUser(id);
        return "通过id删除用户成功";
    }

    @RequestMapping(value = "/updateUser")
    public ModelAndView updateUser() {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        userService.updateUser(user);
        modelAndView.setViewName("updateUser");
        return modelAndView;

    }


    /**
     * 查看用户附加信息
     */
    @RequestMapping(value = "/seeCountry")
    public ModelAndView userExtrInfo(User user) {
        ModelAndView modelAndView = new ModelAndView();
        List<User> list = userService.getAllUsers();
        for (int i = 0; i < list.size(); i++) {
            String country = countryFeignService.findCountry(list.get(i).getCountry_id());
            list.get(i).setCountryName(JSON.parseObject(country, Country.class).getName());
        }
        modelAndView.getModel().put("extrList", list);
        modelAndView.setViewName("userExtr");
        return modelAndView;
    }
}
