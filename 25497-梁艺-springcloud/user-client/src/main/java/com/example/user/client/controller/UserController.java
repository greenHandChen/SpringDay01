package com.example.user.client.controller;

import com.example.user.client.bean.User;
import com.example.user.client.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UserController {

    @Autowired
    IUserService userService;

    @Autowired
    private SimpleDateFormat simpleDateFormat;

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

    @GetMapping("/toAddUser")
    public String toAddUser() {
        return "addUser";
    }

    @PostMapping("/addUser")
    public String addUser(String name, String birthday, Character gender) {
        try {
            Date bd = simpleDateFormat.parse(birthday);
            User user = new User(name, bd, gender);
            int result = userService.insertUser(user);
            if (result > 0) {
                return "allUser";
            } else {
                return "toAddUser";
            }
        } catch (ParseException e) {
            e.printStackTrace();
            return "toAddUser";
        }

    }
}
