package com.ll.springcloud.controller;

import com.ll.springcloud.entities.User;
import com.ll.springcloud.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @package com.ll.com.ll.springcloud.controller
 * @Author LL
 * @ClassName DeptController_Consumer
 * @Date 2019/7/23  9:59
 */
@RestController
public class UserController_Consumer {

    @Autowired
    private UserClientService service;

    @RequestMapping(value = "/consumer/user/get/{id}")
    public User get(@PathVariable("id") int id){
        return service.getById(id);
    }

    @RequestMapping(value = "/consumer/user/list")
    public List<User> list(){
        return service.list();
    }

    @RequestMapping(value = "/consumer/user/add",method = RequestMethod.POST)
    public void add(@RequestBody User user){
        service.add(user);
    }

    @RequestMapping(value = "/consumer/user/update",method = RequestMethod.PUT)
    public void update(@RequestBody User user){
        service.update(user);
    }

    @RequestMapping(value = "/consumer/user/delete/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id){
        service.delete(id);
    }






}
