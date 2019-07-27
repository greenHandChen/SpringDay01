package com.example.service.controller;

import com.example.service.dao.UserDetailDao;
import com.example.service.dto.User;
import com.example.service.dto.UserDetail;
import com.example.service.serviceone.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @Autowired
    private UserDetailDao userDetailDao;

    @RequestMapping("/getList")
    public List<User> getList(){
        List<User> list = userService.getUserList();
        return list;
    }

    @RequestMapping("/getOne")
    public User getOne(long id){
        User user = userService.findUserById(id);
        return user;
    }
    @RequestMapping("/save")
    public String add(User user){
        userService.save(user);
        return "insert ok" ;
    }
    @RequestMapping("/update")
    public String update(User user){
        userService.edit(user);
        return "update ok";
    }
    @RequestMapping("/delete")
    public String delete(Long id){
        userService.delete(id);
        return "delete ok";
    }
    @RequestMapping("/findDetail")
    public UserDetail findDetail(Long id){
        return userDetailDao.findDetail(id);
    }

    @RequestMapping("/findDetails")
    public UserDetail findDetails(){
        return userDetailDao.findALL();
    }

    @RequestMapping("/addDetails")
    public String addDetails(UserDetail userDetail){
        return userDetailDao.addDetail(userDetail);
    }

    @RequestMapping("/updateDetails")
    public String updateDetail(UserDetail userDetail){
        return userDetailDao.updateDetail(userDetail);
    }

    @RequestMapping("/deleteDetails")
    public String deleteDetail(Long id){
        return userDetailDao.deleteDetail(id);
    }
}
