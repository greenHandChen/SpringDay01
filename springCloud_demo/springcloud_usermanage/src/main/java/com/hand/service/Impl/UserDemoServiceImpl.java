package com.hand.service.Impl;
import com.hand.mapper.UserDemoMapper;
import com.hand.pojo.UserDemo;
import com.hand.service.UserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dingwensheng
 * @description: TODO
 * @date 2019/7/2214:24
 */
@Service
public class UserDemoServiceImpl implements UserDemoService {

    @Autowired
    private UserDemoMapper userDemoMapper;
    @Override
    public List<UserDemo> queryUserDemos() {
        return userDemoMapper.queryUserDemos();
    }
}
