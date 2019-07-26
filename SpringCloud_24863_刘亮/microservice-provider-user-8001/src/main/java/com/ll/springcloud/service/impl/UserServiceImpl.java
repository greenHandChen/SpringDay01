package com.ll.springcloud.service.impl;

import com.ll.springcloud.entities.User;
import com.ll.springcloud.mapper.UserMapper;
import com.ll.springcloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @package com.ll.springcloud.service.impl
 * @Author LL
 * @ClassName UserServiceImpl
 * @Date 2019/7/26  15:50
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper mapper;

    public User findUserById(int id) {
        return mapper.findUserById(id);
    }

    public List<User> findAllUsers() {
        return mapper.findUserList();
    }

    public void addUser(User user) {
        mapper.addUser(user);
    }

    public void updateUser(User user) {
        mapper.updateUser(user);
    }

    public void deleteUser(int id) {
        mapper.deleteUserById(id);
    }

}
