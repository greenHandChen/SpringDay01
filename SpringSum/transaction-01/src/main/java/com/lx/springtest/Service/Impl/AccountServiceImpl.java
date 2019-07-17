package com.lx.springtest.Service.Impl;

import com.lx.springtest.Dao.IAccountDao;
import com.lx.springtest.Service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

//    //没有使用事务
//    public void transfer(String outer, String inner, Double money) {
//        accountDao.out(outer,money);
//        int number = 1/0;
//        accountDao.in(inner,money);
//    }

    //注入事务模板
    @Autowired
    private TransactionTemplate transactionTemplate;

    public void transfer(final String outer, final String inner, final Double money){
        transactionTemplate.execute(TransactionStatus ->{
            accountDao.out(outer,money);
            int number = 1/0;
            accountDao.in(inner,money);
            return null;
        });
    }
}
