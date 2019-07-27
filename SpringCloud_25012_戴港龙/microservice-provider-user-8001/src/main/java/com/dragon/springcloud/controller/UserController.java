package com.dragon.springcloud.controller;

import com.dragon.springcloud.entities.User;
import com.dragon.springcloud.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @package com.ll.springcloud.controller
 * @Author LL
 * @ClassName UserController
 * @Date 2019/7/26  15:53
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @RequestMapping(value = "/user/get/{id}",method = RequestMethod.GET)
    public User getUserById(@PathVariable("id") int id){
        return service.findUserById(id);
    }

    @RequestMapping(value = "/user/getAll",method = RequestMethod.GET)
    public List<User> getUsers(){
        return service.findAllUsers();
    }

    @RequestMapping(value = "/user/add",method = RequestMethod.POST)
    public void add(@RequestBody User user){
        service.addUser(user);
    }

    @RequestMapping(value = "/user/update",method = RequestMethod.PUT)
    public void update(@RequestBody User user){
        service.updateUser(user);
    }

    @RequestMapping(value = "/user/delete/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") int id){
        service.deleteUser(id);
    }

}
