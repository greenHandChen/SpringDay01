package com.example.user.client.service;

import com.example.user.client.bean.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("eureka-server-user")
public interface IUserService {

    @RequestMapping(value = "/allUser", method = RequestMethod.GET)
    public List<User> getAllUser();

    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public int deleteUserById(@RequestParam("id") Integer id);

    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public int insertUser(@RequestBody User user);
}
