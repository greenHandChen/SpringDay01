package com.Service;

import com.Dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    @Qualifier("accountDao")
    private AccountDao accountDao;
    @Autowired
    private TransactionTemplate transactionTemplate;
    public void transfer(String outer, String inner, Double money) {
        transactionTemplate.execute(TransactionStatus->{
            this.accountDao.out(outer,money);
            int number=1/0;
            this.accountDao.in(inner,money);
            return  null;

        });

    }
}
