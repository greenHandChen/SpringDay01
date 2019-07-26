package com.example.feigndemo.mapper;

import com.example.feigndemo.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@FeignClient(value = "spring-cloud-producer")
public interface IDemoService {
    @RequestMapping("/test")
    public String test(@RequestParam("param") String param);

    @RequestMapping("/user/queryUser")
    public List<User> queryUser();

    @RequestMapping(value = "/user/deleteUser",method = RequestMethod.GET)
    public Integer deleteUser(@RequestParam("id") Integer id);

    @RequestMapping(value = "/user/addUser",method = RequestMethod.POST)
    public boolean addUser(@RequestBody User user);

    @RequestMapping(value = "/user/updateUser",method = RequestMethod.POST)
    public boolean updateUser(@RequestBody User user);
}
