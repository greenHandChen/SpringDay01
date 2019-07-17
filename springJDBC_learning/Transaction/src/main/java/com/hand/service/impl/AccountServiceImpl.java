package com.hand.service.impl;

import com.hand.DAO.AccountDAO;
import com.hand.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDAO accountDAO;
    @Autowired
    private TransactionTemplate transactionTemplate;

    public void transfer(String outer, String inner, Double money) {
        transactionTemplate.execute(ts ->{
            accountDAO.out(outer,money);
//            int i = 1/0;
            accountDAO.in(inner,money);
            return null;
        } );

    }
}
