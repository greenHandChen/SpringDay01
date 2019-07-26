package com.example.user.client.service.hystrix;

import com.example.user.client.bean.User;
import com.example.user.client.service.IUserService;
import org.springframework.ui.Model;

import java.util.List;

public class UserServiceHystrix implements IUserService {
    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public int deleteUserById(Integer id) {
        return 0;
    }

    @Override
    public int insertUser(User user) {
        return 0;
    }
}
