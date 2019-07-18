package com.wpb.service.impl;

import com.wpb.dao.IAccountDao;
import com.wpb.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements IAccountService {
    private IAccountDao accountDao;
    private TransactionTemplate transactionTemplate;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    @Override
    public int transfer(String outAccount, String inAccount, Double amount) {
        int result1 = accountDao.outAccount(outAccount, amount);
        int result2 = accountDao.inAccount(inAccount, amount);
        return (result1 == result1 ? result1 : 0);
    }

    @Override
    public int transfer2(String outAccount, String inAccount, Double amount) {
        final int[] result = new int[2];
        transactionTemplate.execute(TransactionStatus -> {
            result[0] = accountDao.outAccount(outAccount, amount);
            int i = 3 / 0;
            result[1] = accountDao.inAccount(inAccount, amount);
            return null;
        });
        return (result[0] == result[1] ? result[0] : 0);
    }

    @Override
    public int transfer3(String outAccount, String inAccount, Double amount) {
        int result1 = accountDao.outAccount(outAccount, amount);
        int i = 3/0;
        int result2 = accountDao.inAccount(inAccount, amount);
        return (result1 == result1 ? result1 : 0);
    }

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,rollbackFor = ArithmeticException.class)
    @Override
    public int transfer4(String outAccount, String inAccount, Double amount) {
        int result1 = accountDao.outAccount(outAccount, amount);
        int i = 3 / 0;
        int result2 = accountDao.inAccount(inAccount, amount);
        return (result1 == result1 ? result1 : 0);
    }
}
