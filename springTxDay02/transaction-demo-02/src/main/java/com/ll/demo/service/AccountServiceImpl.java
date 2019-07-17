package com.ll.demo.service;

import com.ll.demo.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl  implements IAccountService{

    @Autowired
    private IAccountDao accountDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    public void transfor(String outer, String inner, int money) {

        transactionTemplate.execute(ts -> {
            accountDao.out(outer,money);
            int i =  1 / 0;
            accountDao.in(inner,money);
            return null;
        });

    }
}
