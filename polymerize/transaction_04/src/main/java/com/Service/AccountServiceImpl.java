package com.Service;

import com.Dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    @Qualifier("accountDao")
    private AccountDao accountDao;
    @Transactional(rollbackFor = Exception.class)
    public void transfer(String outer, String inner, Double money) {
        this.accountDao.out(outer,money);
       int number=1/0;
        this.accountDao.in(inner,money);
    }
}
