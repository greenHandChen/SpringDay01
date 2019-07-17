package com.hsl.transactionTemplate.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDaoImpl accountDao;

    public void ChangeMoney(String formName,String toName, double money) {

        accountDao.OutMoney(formName, money);
		int d = 1/0;
        accountDao.InMoney(toName, money);


    }


}
