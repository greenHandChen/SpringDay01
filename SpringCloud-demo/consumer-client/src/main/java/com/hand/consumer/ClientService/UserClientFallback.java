/**
 * Created by Hsl
 * 2019/7/27 10:13
 */
package com.hand.consumer.ClientService;

import com.hand.consumer.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClientService {
    @Override
    public String findUserById(Integer id) {
        return id +"ERROR:服务器内部错误请稍后再试";
    }

    @Override
    public String addUser(User user) {
        return "ERROR:服务器内部错误请稍后再试";
    }
}
