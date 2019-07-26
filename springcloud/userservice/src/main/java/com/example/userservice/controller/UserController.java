package com.example.userservice.controller;

import com.example.userservice.dao.UserDao;
import com.example.userservice.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserDao userDao;

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable Integer id){
        return userDao.getOne(id);
    }
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public String delUser(@PathVariable Integer id){
        try {
            userDao.delete(id);
            return "删除成功";
        }catch (Exception e){
            return "删除失败";
        }
    }
    @RequestMapping(method = RequestMethod.PUT)
    public User addUser(@RequestBody  User user){
        return   userDao.save(user);

    }
    @RequestMapping(method = RequestMethod.POST)
    public User updateUser(@RequestBody  User user){
        return  userDao.save(user);
    }

}
