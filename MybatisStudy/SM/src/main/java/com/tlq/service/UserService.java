package com.tlq.service;

import com.tlq.enity.User;

import java.util.List;

/**
 * @Description: 用户Service
 * @Author: TanLinQuan
 * @Date: 2019/7/19 16:24
 * @Version: V1.0
 **/
public interface UserService {

   User findUserById(Integer id);
}
