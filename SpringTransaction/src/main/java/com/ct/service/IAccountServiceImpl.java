package com.ct.service;

import com.ct.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Service("accountService")
public class IAccountServiceImpl implements IAccountService {
    @Autowired
    IAccountDao accountDao;
    @Autowired
    TransactionTemplate transactionTemplate;

    @Override
    @Transactional
    public void transfer(String outer, String inner, Double money) {
        accountDao.in(inner, money);
        int i = 10 / 0;
        accountDao.out(outer, money);
    }

    @Override
    public void transfer1(String outer, String inner, Double money) {
        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                accountDao.in(inner, money);
                int i = 10 / 0;
                accountDao.out(outer, money);
                return null;
            }
        });
    }

    @Override
    public void transfer2(String outer, String inner, Double money) {
        accountDao.in(inner, money);
        int i = 10 / 0;
        accountDao.out(outer, money);
    }
}
