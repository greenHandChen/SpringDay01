package com.example.user.client.controller;

import com.example.user.client.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/showAllUsers")
    public String showAllUser(Model model) {
        model.addAttribute("userList", userService.getAllUser());
        return "allUser";
    }

    @GetMapping(value = "/delete/{id}")
    @ResponseBody
    public int deleteUser(@PathVariable("id") Integer id) {
        System.out.println("id is " + id);
        return userService.deleteUserById(id);
    }
}
