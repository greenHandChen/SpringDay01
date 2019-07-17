package com.hand.service.impl;

import com.hand.dao.AccountDao;
import com.hand.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outer, String inner, Double money) {
        accountDao.in(inner, money);
        int number = 1 / 0;
        accountDao.out(outer, money);

    }
}
