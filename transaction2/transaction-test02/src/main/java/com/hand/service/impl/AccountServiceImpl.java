package com.hand.service.impl;

import com.hand.dao.impl.AccountDaoImpl;
import com.hand.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

public class AccountServiceImpl implements AccountService {

    public void setAccountDaoImpl(AccountDaoImpl accountDaoImpl) {
        this.accountDaoImpl = accountDaoImpl;
    }

    private AccountDaoImpl accountDaoImpl;

    @Override
    public void transfer(String inAcc, String outAcc, BigDecimal money) {
            accountDaoImpl.in(inAcc,money);
            //int a = 1/0;
            accountDaoImpl.out(outAcc,money);
    }
}
