package com.airyny.service.userInfo.server;

import com.airyny.service.userInfo.error.UserFeignService;
import com.airyny.service.userInfo.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author:Yonye
 * @Date:2019/7/26 11:18
 * @Version:1.0
 * @deseription:
 **/
@FeignClient(value = "service-user",fallback = UserFeignService.class)
public interface UserFeign {

    @RequestMapping("/selectUser/{id}")
    public User selectUser(@PathVariable("id") Integer id);


    @RequestMapping("/getAllUser")
    public List<User> getAllUser();

}
