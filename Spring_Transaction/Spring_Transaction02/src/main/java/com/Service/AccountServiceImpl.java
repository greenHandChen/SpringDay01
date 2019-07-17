package com.Service;

import com.Dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

@Service("accountServiceImpl")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    public void transfer(String outer, String inner, Integer money) {
        transactionTemplate.execute(TransactionStatus ->{
            accountDao.out(outer,money.intValue());
            int number=1/0;
            accountDao.in(inner,money.intValue());
            return null;
        });
    }
}
