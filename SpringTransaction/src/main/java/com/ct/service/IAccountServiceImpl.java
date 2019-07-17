package com.ct.service;

import com.ct.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
public class IAccountServiceImpl implements IAccountService {
    @Autowired
    IAccountDao accountDao;

    @Override
    @Transactional
    public void transfer(String outer, String inner, Double money) {
        accountDao.in(inner, money);
        int i = 10 / 0;
        accountDao.out(outer, money);
    }
}
