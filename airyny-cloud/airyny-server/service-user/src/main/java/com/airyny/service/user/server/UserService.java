package com.airyny.service.user.server;

import com.airyny.service.user.mapper.UserMapper;
import com.airyny.service.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Yonye
 * @Date:2019/7/26 10:18
 * @Version:1.0
 * @deseription:
 **/
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> selectAll(){
        List<User> list=new ArrayList<>();
        list=userMapper.selectAll();
        return list;
    }

    public User select(Integer id){
        User user=new User();
        user=userMapper.findUserById(id);
        return user;
    }

}
