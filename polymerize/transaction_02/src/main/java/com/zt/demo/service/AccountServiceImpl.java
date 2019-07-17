package com.zt.demo.service;

import com.zt.demo.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    public void transfer(String outer, final String inner, final BigDecimal money) {
        transactionTemplate.execute(ts -> {
            accountDao.out(outer, money);
            int i = 1 / 0;
            accountDao.in(inner, money);
            return null;
        });
    }
}
