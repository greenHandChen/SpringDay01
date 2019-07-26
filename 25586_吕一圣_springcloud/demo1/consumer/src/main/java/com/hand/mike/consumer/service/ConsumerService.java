package com.hand.mike.consumer.service;

import com.hand.mike.provider.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@FeignClient(value = "provider")
public interface ConsumerService {

    /**
      * @Desc: 添加用户
      */
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    Integer addUser(@RequestBody User user);

    /**
      * @Desc: 更新用户
      */
    @RequestMapping(value = "/updateUser")
    Integer updateUser(@RequestBody User user);

    /**
      * @Desc: 删除用户
      */
    @RequestMapping(value = "/deleteUser/{id}")
    Integer deleteUser(@PathVariable("id")Integer id);

    /**
      * @Desc: 获取用户
      */
    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    User getUser(@PathVariable("id")Integer id);


}
