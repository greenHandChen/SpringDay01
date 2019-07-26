package com.hand.service.impl;

import com.hand.dao.AccountDao;
import com.hand.entity.Account;
import com.hand.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/26
 */
@Transactional
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> getAccount(Integer id) {
        return accountDao.getAccount(id);
    }

    @Override
    public Object delAccount(Integer id) {
        Account account=null;
        List<Account> list = accountDao.getAccount(id);
        if(list != null&&list.size()==1){
            accountDao.delAccount(id);
            return list.get(0);
        }else {
            return " 数据不存在 无法删除 ";
        }

    }

    @Override
    public Integer addAccount(Account account) {
        accountDao.addAccount(account);
        return account.getId();
    }

    @Override
    public Integer updAccount(Account account) {
        accountDao.updAccount(account);
        return account.getId();
    }
}
