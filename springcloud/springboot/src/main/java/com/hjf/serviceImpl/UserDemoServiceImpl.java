package com.hjf.serviceImpl;

import com.hjf.mapper.UserDemoMapper;
import com.hjf.pojo.UserDemo;
import com.hjf.service.UserDemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:UserDemoServiceImpl
 * Author:Hejunfeng
 * Date:2019/7/22 16:54
 */
@Service("UserDemoService")
public class UserDemoServiceImpl implements UserDemoService {
    @Resource
    private UserDemoMapper userDemoMapper;
    @Override
    public List<UserDemo> queryUserDemo() {
        return userDemoMapper.queryUserDemo();
    }
}