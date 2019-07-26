package com.hjf.serviceImpl;

import com.hjf.mapper.UserMapper;
import com.hjf.pojo.User;
import com.hjf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:UserServiceImpl
 * Author:Hejunfeng
 * Date:2019/7/26 14:30
 */
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> queryUser() {
        return userMapper.queryUser();
    }

    @Override
    public Integer deleteUser(Integer id) {
        System.out.println("删除成功");
        return userMapper.deleteUser(id);
    }

    @Override
    public boolean addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }
}