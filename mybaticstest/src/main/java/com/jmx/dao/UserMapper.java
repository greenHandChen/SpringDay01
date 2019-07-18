package com.jmx.dao;

import com.jmx.domain.Account;

import java.util.List;

/**
 * Created by minxi.jiang on 2019/7/18
 *
 * */
public interface UserMapper {
    /**
     * @Author:minxi.jiang
     * @Decription 根据用户ID查询用户
     * @Date 2019/7/18 14:17
     * */
    Account findUserById(Integer id);
    /**
     * @Author:minxi.jiang
     * @Decription:根据用户名获取用户列表
     * @Date 2019/7/18
     * */
    List<Account> findUserByName(String username);
    /**
     * @Author:minxi.jiang
     * @Decription:添加用户
     * @Date   2019/7/18
     */
    int addUser(Account account);

}
