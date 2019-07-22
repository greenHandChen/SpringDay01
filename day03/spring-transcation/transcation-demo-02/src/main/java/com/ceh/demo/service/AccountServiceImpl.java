package com.ceh.demo.service;

import com.ceh.demo.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import java.math.BigDecimal;

/**
 * Created by enHui.Chen on 2019/7/17.
 */
@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    @Autowired
    private TransactionTemplate transactionTemplate;

    public void transfer(String outer, String inner, BigDecimal money) {
        transactionTemplate.execute(ts -> {
            accountDao.out(outer, money);
//            int num = 1 / 0;
            accountDao.in(inner, money);
            return null;
        });

    }
}
