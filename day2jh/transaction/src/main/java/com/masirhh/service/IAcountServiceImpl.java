package com.masirhh.service;

import com.masirhh.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

import java.math.BigDecimal;

@Service
public class IAcountServiceImpl implements IAcountService {
    @Autowired
    AccountDao accountDao;

    @Transactional(rollbackFor = Exception.class)
    public void tansfer(String outer, String inner, BigDecimal money) {
        try {
            accountDao.in(outer, money);
            int mun = 100 / 0;
            accountDao.out(inner, money);
        }
        catch (Exception e){
            System.out.println("There is an Exception!");
        }
    }
}
