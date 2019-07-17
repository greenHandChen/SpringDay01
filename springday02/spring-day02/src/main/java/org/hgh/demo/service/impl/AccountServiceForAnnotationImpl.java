package org.hgh.demo.service.impl;

import org.hgh.demo.dao.IAccountDao;
import org.hgh.demo.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service("accountServiceForAnnotationImpl")
public class AccountServiceForAnnotationImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transfer(String outer, String inner, BigDecimal money) {
        accountDao.out(outer,money);
//        int number = 1/0;
        accountDao.in(inner,money);
    }
}
