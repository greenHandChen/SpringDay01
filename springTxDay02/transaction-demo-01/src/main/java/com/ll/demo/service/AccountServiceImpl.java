package com.ll.demo.service;

import com.ll.demo.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl  implements IAccountService{

    @Autowired
    private IAccountDao accountDao;

    public void transfor(String outer, String inner, int money) {
        accountDao.out(outer,money);
        accountDao.in(inner,money);
    }
}
