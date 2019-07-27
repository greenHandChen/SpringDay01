/**
 * Created by Hsl
 * 2019/7/26 17:00
 */
package com.hand.provider.Controller;

import com.hand.provider.Service.OrderServiceImpl;
import com.hand.provider.Service.UserServiceImpl;
import com.hand.provider.mapper.UserMapper;
import com.hand.provider.pojo.Order;
import com.hand.provider.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class UsreController {

    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private OrderServiceImpl orderService;

    @GetMapping("/user/{id}")
    public User findUser(@PathVariable("id") Integer id){

      User user = userService.findUserById(id);

        return  user;
    }

    @PostMapping("/user/add")
    public String addUser(@RequestBody User user){

        user.setAddress(user.getAddress());
        user.setUsername(user.getUsername());
        user.setSex(user.getSex());
         userService.addUser(user);

        return  "AddSuccess";
    }


    @GetMapping("/getOrder/{id}")
    public Order getOrder(@PathVariable("id") Integer id){


        Order order = orderService.findOrderByUserId(id);

        return  order ;
    }



}
