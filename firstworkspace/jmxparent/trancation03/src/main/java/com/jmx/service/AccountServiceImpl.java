package com.jmx.service;

import com.jmx.dao.IAccountDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by jiangminxi on 2019/7/18
 */
@Service
public class AccountServiceImpl implements  IAccountService{
    @Autowired
    private IAccountDaoImpl iAccountDao;
    @Override
    public void transfer(String inter, String outer, Double money) {
            iAccountDao.out(outer,money);
            int a=1/0;
            iAccountDao.in(inter,money);

    }
}
