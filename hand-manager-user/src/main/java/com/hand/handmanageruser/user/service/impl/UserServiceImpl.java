package com.hand.handmanageruser.user.service.impl;

import com.hand.handmanageruser.user.dao.IUserMapper;
import com.hand.handmanageruser.user.entity.User;
import com.hand.handmanageruser.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lwy
 * @version V1.0
 * @program: spring-cloud-exercise
 * @Description: TODO
 * @date 2019/7/26 15:51
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserMapper userMapper;

    @Override
    public User findUserById(Long userId) {
        return userMapper.findUserById(userId);
    }

    @Override
    public Long delUserById(Long userId) {
        return userMapper.delUserById(userId);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public Long addUser(User user) {
        return userMapper.addUser(user);
    }
}
