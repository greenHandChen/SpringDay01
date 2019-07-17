package org.hgh.demo.service.impl;

import org.hgh.demo.dao.IAccountDao;
import org.hgh.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service("accountServiceForFactoryImpl")
public class AccountServiceForFactoryImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public void transfer(String outer, String inner, BigDecimal money) {
        accountDao.out(outer,money);
//        int number = 1/0;
        accountDao.in(inner,money);
    }
}
