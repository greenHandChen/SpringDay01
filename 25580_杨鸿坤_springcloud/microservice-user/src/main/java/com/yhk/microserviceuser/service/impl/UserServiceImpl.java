package com.yhk.microserviceuser.service.impl;

import com.yhk.microserviceuser.mapper.UserMapper;
import com.yhk.microserviceuser.pojo.User;
import com.yhk.microserviceuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<User> findAllUser() {
        List<User> allUser = userMapper.findAllUser();
        return allUser;
    }

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    @Override
    public User findUser(int id) {
        User user = userMapper.findUser(id);
        return user;
    }

    /**
     * 添加用户
     * @param user
     */
    @Override
    public void insertUser(User user) {
       userMapper.insertUser(user);
    }
    /**
     *     更新用户
      */
    @Override
    public int upUser(User user) {
        int i = userMapper.upUser(user);
        return i;
    }

    /**
     * 删除用户
     * @param user
     * @return
     */
    @Override
    public int delUser(User user) {
        int i = userMapper.delUser(user);
        return i;
    }
}
