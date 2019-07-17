package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import com.spring.dao.IAccountDao;

import javax.annotation.Resource;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 16:26 2019/7/17
 * @Modified By:
 */

public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void transfer(String outer, String inner, Double money) {
        accountDao.out(outer,money);
        int number = 1/0;
        accountDao.in(inner,money);
    }

    public IAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

}
