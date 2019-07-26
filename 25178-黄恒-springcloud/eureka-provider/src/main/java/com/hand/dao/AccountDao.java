package com.hand.dao;

import com.hand.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/26
 */
@Component
@Mapper
public interface AccountDao {
    //获取账户信息
    List<Account> getAccount(Integer id);
    //根据用户 id 删除用户信息
    Integer delAccount(Integer id);
    //添加用户信息
    Integer addAccount(Account account);
    //修改信息
    Integer updAccount(Account account);
}
