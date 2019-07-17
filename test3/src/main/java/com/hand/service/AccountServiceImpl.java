package com.hand.service;

import com.hand.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by HuangHeng on 2019/7/17
 */
@Service
public class AccountServiceImpl implements IAccountService{
    @Autowired
    private AccountDao accountDao;

//    @Autowired
//    private TransactionTemplate transactionTemplate;

    @Transactional(rollbackFor = Exception.class)
    public void transfer(String outer, String inner, int money) {
        accountDao.out(outer,money);
        int i =  1 / 0;
        accountDao.in(inner,money);
    }
}
