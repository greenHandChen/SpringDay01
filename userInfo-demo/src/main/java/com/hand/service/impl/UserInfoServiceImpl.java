package com.hand.service.impl;

import com.hand.mapper.UserInfoMapper;
import com.hand.service.UserInfoService;
import com.hand.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;
    @Override

    public UserInfo getUserInfo(int id) {
        return userInfoMapper.getUserInfo(id);
    }
}
