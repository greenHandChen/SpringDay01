package com.hand.service;

import com.hand.entity.User;
import com.hand.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserRepository userRepository;

    // 用户列表
    public List<User> userList() {

        return userRepository.findAll();

    }

    // 添加用户 / 修改用户
    public User updteUser(User user) {

        return userRepository.save(user);

    }

    // 删除用户
    public void removeUser(User user) {

        userRepository.delete(user);

    }

    // 查询用户
    public User getUserById(Integer id) {

        return userRepository.getOne(id);

    }
}
