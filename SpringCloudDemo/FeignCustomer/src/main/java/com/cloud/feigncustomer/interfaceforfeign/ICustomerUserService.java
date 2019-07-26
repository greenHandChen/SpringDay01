package com.cloud.feigncustomer.interfaceforfeign;

import com.cloud.feigncustomer.HystrixForFeign.CustomerUserServiceImpl;
import com.cloud.feigncustomer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@FeignClient(value = "service-userclient",fallback = CustomerUserServiceImpl.class)
public interface ICustomerUserService {
    @RequestMapping(value = "/user/byName",method = RequestMethod.GET)
    String getUserByName(@RequestParam("name")String name);

    @RequestMapping(value = "/user/delUser",method = RequestMethod.GET)
    String delUserInfoByName(@RequestParam("name")String name);

    @RequestMapping(value = "/user/insertUser",method = RequestMethod.POST)
    String insertUserInfo(@RequestBody User user);
}
