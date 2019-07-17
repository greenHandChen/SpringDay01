package com.zhang.service.impl;

import com.zhang.dao.IAccountDao;
import com.zhang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * ClassName:IAccountServiceImpl
 * Author:ZhangChunjia
 * Date:2019/7/17 19:51
 */
@Service
public class IAccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao iAccountDao;
    //注入事务模板
    @Autowired
    private TransactionTemplate transactionTemplate;

    public void transfer(final String outer, final String inner, final Double money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                iAccountDao.out(outer,money);
                int number=1/0;
                iAccountDao.in(inner,money);

            }
        });

    }

}
