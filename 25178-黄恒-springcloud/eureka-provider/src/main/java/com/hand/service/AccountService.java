package com.hand.service;

import com.hand.entity.Account;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/26
 */
public interface AccountService {
    //获取账户信息
    List<Account> getAccount(Integer id);

    //根据用户 id 删除用户信息
    Object delAccount(Integer id);
    //添加用户信息
    Integer addAccount(Account account);
    //修改信息
    Integer updAccount(Account account);
}
