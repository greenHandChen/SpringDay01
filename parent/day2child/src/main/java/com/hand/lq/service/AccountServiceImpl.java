package com.hand.lq.service;

import com.hand.lq.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private TransactionTemplate transactionTemplate;
    @Override
    public void transfer(String outUser, String inUser, Double money) {
        transactionTemplate.execute(TransactionStatus->{
                    accountDao.out(outUser,money);
                    int number=1/0;
                    accountDao.in(inUser,money);
                    return  null;
                }
        );

    }
    public void transfer2(String outUser, String inUser, Double money) {
        accountDao.out(outUser,money);
        int number=1/0;
        accountDao.in(inUser,money);
    }
    @Transactional(rollbackFor = Exception.class)
    public void transfer3(String outUser, String inUser, Double money) {
        accountDao.out(outUser,money);
        int number=1/0;
        accountDao.in(inUser,money);
    }
}
