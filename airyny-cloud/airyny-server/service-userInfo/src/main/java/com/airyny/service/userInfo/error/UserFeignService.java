package com.airyny.service.userInfo.error;

import com.airyny.service.userInfo.model.User;
import com.airyny.service.userInfo.server.UserFeign;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Yonye
 * @Date:2019/7/26 11:21
 * @Version:1.0
 * @deseription:
 **/
@Service
public class UserFeignService implements UserFeign {
    @Override
    public User selectUser(Integer id) {
        User user=new User();
        user.setUsername("no User");

        return user;
    }

    @Override
    public List<User> getAllUser() {
        List<User> list=new ArrayList<>();
        User user=new User();
        user.setUsername("no User");
        list.add(user);
        return list;
    }
}
