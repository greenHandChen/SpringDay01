package com.lx.springtest.Service.Impl;

import com.lx.springtest.Dao.IAccountDao;
import com.lx.springtest.Service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String outer, String inner, Double money) {
        accountDao.out(outer,money);
        int number = 1/0;
        accountDao.in(inner,money);
    }
}
