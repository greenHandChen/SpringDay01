package com.hand.trans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class IAccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    //注入事务模板
    private TransactionTemplate transactionTemplate;

    public void transfer(String outer, String inner, Double money) {
        accountDao.out(outer, money);
        int number = 1 / 0;
        accountDao.in(inner, money);
    }

    public void transferTemplate(String outer, String inner, Double money) {
        transactionTemplate.execute(TransactionStatus -> {
            accountDao.out(outer, money);
            int number = 1 / 0;
            accountDao.in(inner, money);
            return null;
        });

    }
    public void transferProxy(String outer, String inner, Double money){
        accountDao.out(outer,money);
        int number=1/0;
        accountDao.in(inner,money);
    }
    @Transactional(rollbackFor = Exception.class)
    public void transferThree(String outer, String inner, Double money){
        accountDao.out(outer,money);
        int number=1/0;
        accountDao.in(inner,money);
    }

}

