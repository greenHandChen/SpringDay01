package com.example.userserver.service.user;

import com.example.userserver.mapper.UserMapper;
import com.example.userserver.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKeys(int[] ids) {
        return userMapper.deleteByPrimaryKeys(ids);
    }

    @Override
    public List<User> selectByUser(User user) {
        return userMapper.selectByUser(user);
    }
}
