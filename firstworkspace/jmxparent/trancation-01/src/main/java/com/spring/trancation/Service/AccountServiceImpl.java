package com.spring.trancation.Service;

import com.spring.trancation.Dao.AccountDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService{
     @Autowired
     private AccountDaoImpl accountDaoImpl;

    public void tranfer(String inter, String outer, Double money) {
         accountDaoImpl.out(outer,money);
         int a=1/0;
         accountDaoImpl.in(inter,money);
    }
}
