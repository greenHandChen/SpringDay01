package com.example.user.client.controller;

import com.example.user.client.bean.User;
import com.example.user.client.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class UserController {

    @Autowired
    IUserService userService;

    @Autowired
    private SimpleDateFormat simpleDateFormat;

    @RequestMapping(value = "/showAllUsers", method = RequestMethod.GET)
    public String showAllUser(Model model) {
        model.addAttribute("userList", userService.getAllUser());
        return "allUser";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public int deleteUser(@PathVariable("id") Integer id) {
        System.out.println("id is " + id);
        return userService.deleteUserById(id);
    }

    @RequestMapping(value = "/toAddUser", method = RequestMethod.GET)
    public String toAddUser() {
        return "addUser";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public void addUser(String name, String birthday, String gender) {

        try {
            Date bd = simpleDateFormat.parse(birthday);
            User user = new User(name, bd, gender.charAt(0));
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");
            System.out.println(user);
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");
            int result = userService.insertUser(user);

            if (result > 0) {
                this.showAllUser(new ConcurrentModel());
            } else {
                this.toAddUser();
            }
        } catch (ParseException e) {
            e.printStackTrace();
            this.toAddUser();
        }

    }
}
