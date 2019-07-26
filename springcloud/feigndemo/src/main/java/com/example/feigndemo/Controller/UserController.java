package com.example.feigndemo.Controller;

import com.example.feigndemo.mapper.IDemoService;
import com.example.feigndemo.pojo.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:UserController
 * Author:Hejunfeng
 * Date:2019/7/26 14:52
 */
@RequestMapping("/feign")
@RestController
public class UserController {
    @Resource
    private IDemoService iDemoService;
    @RequestMapping("/queryUser")
    public List<User> demo(){
        return iDemoService.queryUser();
    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
    public Integer deleteUser(Integer id){
        return iDemoService.deleteUser(id);
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public boolean addUser(User user){
        System.out.println("userController:"+user);
        return iDemoService.addUser(user);
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public boolean updateUser(User user){
        return iDemoService.updateUser(user);
    }

}