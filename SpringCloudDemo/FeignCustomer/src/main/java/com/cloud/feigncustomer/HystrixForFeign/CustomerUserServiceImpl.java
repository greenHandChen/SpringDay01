package com.cloud.feigncustomer.HystrixForFeign;

import com.cloud.feigncustomer.interfaceforfeign.ICustomerUserService;
import com.cloud.feigncustomer.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

/**
 * @description: feign的断路器实现类，当发生故障时，调用此类方法
 * @author: xueWu.Chen
 * @create: 2019-07-26
 **/

@Component
public class CustomerUserServiceImpl implements ICustomerUserService {
    @Override
    public String getUserByName(String name) {
        return "sorry something is wrong"+name;
    }

    @Override
    public String delUserInfoByName(String name) {
        return "sorry delete is wrong";
    }

    @Override
    public String insertUserInfo(User user) {
        System.out.println(user);
        return "sorry insert is wrong";
    }

}
