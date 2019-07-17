package com.lhb.service.impl;

import com.lhb.dao.IAccountDao;
import com.lhb.dao.impl.IAccountDaoImpl;
import com.lhb.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created By LHB on 2019/7/17;
 */

public class IAccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     * 转账
     * @param outer
     * @param inner
     * @param money
     */
    public void transfer(String outer, String inner, Double money) {
        accountDao.out(outer,money);
//        int i=1/0;
        accountDao.in(inner,money);
    }




}
