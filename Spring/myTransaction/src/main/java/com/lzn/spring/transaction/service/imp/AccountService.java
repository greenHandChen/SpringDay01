package com.lzn.spring.transaction.service.imp;

import com.lzn.spring.transaction.dao.imp.AccountDao;
import com.lzn.spring.transaction.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService implements IAccountService {
    @Autowired
    private AccountDao accountDao;

    public void transfer(String outer, String inner, Double money) {
        accountDao.out(outer, money);
//        int i = 1 / 0;
        accountDao.in(inner, money);
    }
}
