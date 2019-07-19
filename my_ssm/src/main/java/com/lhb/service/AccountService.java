package com.lhb.service;

import com.lhb.domain.Account;

import java.util.List;
import java.util.ListResourceBundle;

/**
 * Created By LHB on 2019/7/19;
 */
public interface AccountService {

    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    public void saveAccount(Account account);
}
