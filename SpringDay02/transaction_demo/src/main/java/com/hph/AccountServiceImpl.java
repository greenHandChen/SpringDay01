package com.hph;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    public void transfer(final String outer, final String inner, final Double money) {
        transactionTemplate.execute(TransactionStatus -> {
            accountDao.out(outer, money);
            int number = 1/0;
            accountDao.in(inner, money);
            return null;
        });
    }
}

