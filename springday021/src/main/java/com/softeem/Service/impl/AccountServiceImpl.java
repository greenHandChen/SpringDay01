package com.softeem.Service.impl;

import com.softeem.Service.AccountService;
import com.softeem.dao.IAccountDao;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {
  //注入转账的DAO
    private IAccountDao iAccountDao;
    //注入事务管理模板
    private TransactionTemplate transactionTemplate;

   @Override
   public void transfer(final String out,final String in,final  int money) {
       transactionTemplate.execute(new TransactionCallbackWithoutResult() {
           @Override
           protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
               iAccountDao.outMoney(out,money);
               int i = 1/0;
               iAccountDao.inMoney(in,money);
           }
       });
  }

    public void setiAccountDao(IAccountDao iAccountDao) {
        this.iAccountDao = iAccountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
}
