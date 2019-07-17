package com.zd.Service;

import com.zd.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl implements IAccountService{

    @Autowired
    private IAccountDao accountDao;

    //注入事务模板
    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    public void transfer(final String outer, final String inner, final Double money) {
        transactionTemplate.execute(new TransactionCallback() {

            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                try {
                    accountDao.out(outer,money);
                    System.out.println(1/0);
                    accountDao.in(inner,money);
                } catch (Exception e) {

                }finally {
                    transactionStatus.setRollbackOnly();
                }

                return null;

            }
        });
    }
  }