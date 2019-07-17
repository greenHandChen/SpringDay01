package com.zt.demo.service;

import com.zt.demo.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    public void transfer(String outer, String inner, BigDecimal money) {
        accountDao.out(outer, money);
        int i = 1 / 0;
        accountDao.in(inner, money);
    }
}
