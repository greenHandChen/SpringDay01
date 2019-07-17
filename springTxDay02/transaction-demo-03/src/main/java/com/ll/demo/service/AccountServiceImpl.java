package com.ll.demo.service;

import com.ll.demo.dao.IAccountDao;

public class AccountServiceImpl  implements IAccountService{

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    //    @Autowired
//    private TransactionTemplate transactionTemplate;

    public void transfor(String outer, String inner, int money) {

        accountDao.out(outer,money);
        int i =  1 / 0;
        accountDao.in(inner,money);

    }

}
