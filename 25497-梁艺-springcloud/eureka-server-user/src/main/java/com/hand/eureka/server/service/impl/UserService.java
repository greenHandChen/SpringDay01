package com.hand.eureka.server.service.impl;

import com.hand.eureka.server.bean.User;
import com.hand.eureka.server.mapper.UserMapper;
import com.hand.eureka.server.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务层
 * @author Fandelu
 */
@Service
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;

    /**
     * 获取所有用户
     * @return 查询结果
     */
    @Override
    public List<User> getAllList() {
        return userMapper.getAllList();
    }

    /**
     * 根据ID获取用户
     * @param id
     * @return 查询结果
     */
    @Override
    public User getById(Integer id) {
        return userMapper.getById(id);
    }

    /**
     * 根据ID删除用户
     * @param id 用户ID
     * @return 执行结果
     */
    @Override
    public int deleteById(Integer id) {
        return userMapper.deleteById(id);
    }

    /**
     * 添加用户
     * @param entity 用户实体
     * @return 执行结果
     */
    @Override
    public int insert(User entity) {
        return userMapper.insert(entity);
    }

    /**
     * 更新用户
     * @param entity 用户实体
     * @return 执行结果
     */
    @Override
    public int update(User entity) {
        return userMapper.update(entity);
    }
}
