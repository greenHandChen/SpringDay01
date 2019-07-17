package com.zt.demo.service;

import com.zt.demo.dao.IAccountDao;
import com.zt.demo.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String outer, final String inner, final BigDecimal money) {
        accountDao.out(outer, money);
        int i = 1 / 0;
        accountDao.in(inner, money);
    }
}
