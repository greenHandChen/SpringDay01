package com.zt.eureka_producer_user.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zt.eureka_producer_user.client.ExtClient;
import com.zt.eureka_producer_user.dto.User;
import com.zt.eureka_producer_user.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: invokerZt
 * @date: 2019-07-26 9:56
 */
@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private ExtClient extClient;

    @Autowired
    private IUserService userService;

    @GetMapping("/user")
    public String queryUsers(@RequestParam(name = "username", required = false, defaultValue = "invoker") String username) throws JsonProcessingException {
        /**
         * @description: 根据用户名模糊查询用户
         * @author: invokerZt
         * @date: 2019-07-26 10:07
         * @param username:
         * @return: java.lang.String
         */
        List<User> users = userService.queryUserByName(username);
        return objectMapper.writeValueAsString(users);
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable String id) throws JsonProcessingException {
        /**
         * @description: 根据用户id精确查找用户
         * @author: invokerZt
         * @date: 2019-07-26 10:10
         * @param id:
         * @return: java.lang.String
         */
        User user = userService.queryUserById(Integer.valueOf(id));
        return objectMapper.writeValueAsString(user);
    }

    @PostMapping("/user")
    public String createUser(@RequestBody User user) throws JsonProcessingException {
        /**
         * @description: 创建用户
         * @author: invokerZt
         * @date: 2019-07-26 10:15
         * @param user:
         * @return: java.lang.String
         */
        int addResult = userService.addUser(user);
        if(addResult == 1) {
            return objectMapper.writeValueAsString("create user success.");
        }else {
            return objectMapper.writeValueAsString("create user failed.");
        }


    }

    @PutMapping("/user")
    public String updateUser(@RequestBody User user) throws JsonProcessingException {
        /**
         * @description: 更新用户信息
         * @author: invokerZt
         * @date: 2019-07-26 10:19
         * @param id:
         * @param user:
         * @return: java.lang.String
         */
        int updateResult = userService.updateUser(user);
        if(updateResult == 1) {
            return objectMapper.writeValueAsString("update user success.");
        }else {
            return objectMapper.writeValueAsString("update user failed.");
        }
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable String id) throws JsonProcessingException {
        /**
         * @description: 删除用户
         * @author: invokerZt
         * @date: 2019-07-26 10:20
         * @param id:
         * @return: java.lang.String
         */
        int deleteResult = userService.deleteUser(Integer.valueOf(id));
        if(deleteResult == 1) {
            return objectMapper.writeValueAsString("delete user success.");
        }else {
            return objectMapper.writeValueAsString("delete user failed.");
        }
    }

    @GetMapping("/orders")
    public String getOrders(@RequestParam(name = "username", required = true, defaultValue = "invoker") String username) {
        /**
         * @description: 调用eureka-prodeucer-ext的/eorders接口，查询用户订单
         * @author: invokerZt
         * @date: 2019-07-26 11:39
         * @param :
         * @return: java.lang.String
         */
        return extClient.getOrdersByName(username);
    }

    @GetMapping("/orders/{id}")
    public String getOrdersById(@PathVariable String id) {
        /**
         * @description: 调用eureka-prodeucer-ext的/eorders/{id}接口，查询用户订单
         * @author: invokerZt
         * @date: 2019-07-26 16:30
         * @param id:
         * @return: java.lang.String
         */
        return extClient.getOrdersById(id);
    }

}
