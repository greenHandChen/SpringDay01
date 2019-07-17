package com.yts.service;

import com.yts.dao.AccountDaoImpl;
import com.yts.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl implements IAccountService  {

    @Autowired
    private IAccountDao accountDao;

    @Transactional(rollbackFor = Exception.class)
    public void transfer(String outer, String inner, Double money) {
        accountDao.out(outer,money);
        int i = 1/0;
        accountDao.in(inner,money);
    }

//    @Autowired
//    private TransactionTemplate transactionTemplate;
//
//    public void transfer(final String outer, final String inner, final Double money) {
//
//        transactionTemplate.execute(new TransactionCallback<Object>() {
//            public Object doInTransaction(TransactionStatus transactionStatus) {
//                accountDao.out(outer,money);
//                int i = 1/0;
//                accountDao.in(inner,money);
//                return null;
//            }
//        });
//
//    }
}
