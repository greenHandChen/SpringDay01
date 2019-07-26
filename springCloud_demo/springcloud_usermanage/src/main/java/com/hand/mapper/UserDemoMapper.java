package com.hand.mapper;

import com.hand.pojo.UserDemo;

import java.util.List;

/**
 * @author dingwensheng
 * @description: TODO
 * @date 2019/7/2214:08
 */
public interface UserDemoMapper {
    List<UserDemo> queryUserDemos();
    UserDemo   addUserDemos(UserDemo userDemo);
}
