package com.hand.service.impl;

import com.hand.dao.impl.AccountDaoImpl;
import com.hand.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDaoImpl accountDaoImpl;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transfer(String inAcc, String outAcc, BigDecimal money) {
            accountDaoImpl.in(inAcc,money);
            //int a = 1/0;
            accountDaoImpl.out(outAcc,money);
    }
}
