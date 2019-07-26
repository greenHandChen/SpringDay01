package com.springcloud.eurekaclient.service.impl;

import com.springcloud.eurekaclient.bean.User;
import com.springcloud.eurekaclient.mapper.UserMapper;
import com.springcloud.eurekaclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        return userMapper.getUserById(map);
    }

    @Override
    public void deleteUserById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        userMapper.deleteUserById(map);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("client service:"+user);
        Map<String, Object> map = new HashMap<>();
        map.put("user", user);
        userMapper.updateUser(map);
    }

    @Override
    public void addUser(User user) {
        System.out.println("client service:"+user);
        Map<String, Object> map = new HashMap<>();
        map.put("user", user);
        userMapper.addUser(map);
    }
}
