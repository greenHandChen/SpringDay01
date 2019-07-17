package org.hgh.demo.service.impl;

import org.hgh.demo.dao.IAccountDao;
import org.hgh.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

import java.math.BigDecimal;

@Service("accountServiceImpl")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    @Autowired
    private TransactionTemplate t;

    public void transfer(String outer, String inner, BigDecimal money) {
        t.execute(TransactionStatus ->{
            accountDao.out(outer,money);
//            int number = 1/0;
            accountDao.in(inner,money);
            return null;
        });
    }
}
