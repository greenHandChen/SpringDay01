package com.lhb.service.impl;

import com.lhb.dao.IAccountDao;
import com.lhb.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created By LHB on 2019/7/17;
 */

public class IAccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    //    注入事务模板
    @Autowired
    private TransactionTemplate transactionTemplate;

    /**
     * 转账
     *
     * @param outer
     * @param inner
     * @param money
     */

    @Transactional(rollbackFor = Exception.class)
    public void transfer(String outer, String inner, Double money) {
        accountDao.out(outer, money);
//        int i = 1 / 0;
        accountDao.in(inner, money);

    }


}
