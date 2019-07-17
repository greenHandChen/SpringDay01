package com.yts.service;

import com.yts.dao.AccountDaoImpl;
import com.yts.dao.IAccountDao;

public class AccountService implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao){
        this.accountDao = accountDao;
    }

    public void transfer(String outer, String inner, Double money) {
        accountDao.out(outer,money);
//        int i = 1/0;
        accountDao.in(inner,money);
    }
}
