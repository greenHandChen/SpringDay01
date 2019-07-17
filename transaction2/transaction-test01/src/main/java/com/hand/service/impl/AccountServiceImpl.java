package com.hand.service.impl;

import com.hand.dao.impl.AccountDaoImpl;
import com.hand.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDaoImpl accountDaoImpl;

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    public void transfer(String inAcc, String outAcc, BigDecimal money) {
        transactionTemplate.execute(transactionStatus -> {
            accountDaoImpl.in(inAcc,money);
            int a = 1/0;
            accountDaoImpl.out(outAcc,money);
            return null;
        });
    }
}
