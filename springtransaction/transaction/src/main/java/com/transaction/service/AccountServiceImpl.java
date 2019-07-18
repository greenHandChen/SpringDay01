package com.transaction.service;

import com.transaction.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao iAccountDao;

    public void transfer(String outer, String inner, Double money) {
        iAccountDao.out(outer,money);
        int number = 1/0;
        iAccountDao.in(inner,money);
    }
}
