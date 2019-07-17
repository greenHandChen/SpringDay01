package com.yonye.spring.transcation.template.serverImpl;

import com.yonye.spring.transcation.template.dao.IAccountDao;
import com.yonye.spring.transcation.template.server.IAccountService;

public class AccountTranImpl  implements IAccountService {

    private IAccountDao accountDao;

    public IAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outer, String inner, Double money) {
            accountDao.out(outer,money);
            int number =1/0;
            accountDao.in(inner,money);
    }
}
