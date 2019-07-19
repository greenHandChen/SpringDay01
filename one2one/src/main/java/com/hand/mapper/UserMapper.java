package com.hand.mapper;

import com.hand.entity.User;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/19
 */
public interface UserMapper {
    /**
     * @Author:  HuangHeng
     * @Description  
     * @CreateDate:  2019/7/19
     */
    User findUserById(Integer id);

    int addUser(User user);
}
