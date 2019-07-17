package com.sise.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService{


    private AccountDao accountDao;

    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    //注入事务模板
//    @Autowired
//    private TransactionTemplate transactionTemplate;

    //编程式管理
//    public void transfer(final String outer,final String inner,final Double money) {
//        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
//            @Override
//            protected void doInTransactionWithoutResult(TransactionStatus status) {
//                accountDao.out(outer,money);
//                int number = 1/0;
//                accountDao.in(inner,money);
//            }
//        });
//
//    }
    //基于注解
//    @Transactional(rollbackFor = Exception.class)
    public void transfer(String outer,String inner,Double money) {
                accountDao.out(outer,money);
                int number = 1/0;
                accountDao.in(inner,money);
    }
}
