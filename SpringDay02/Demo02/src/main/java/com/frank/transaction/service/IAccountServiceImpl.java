package com.frank.transaction.service;


import com.frank.transaction.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IAccountServiceImpl implements IAccountService{
    @Autowired
    private IAccountDao iAccountDao;
    public void transfer(String outer,String inner,Double money){
        iAccountDao.out(outer,money);
        int i = 1/0;
        iAccountDao.in(inner,money);
    }
}