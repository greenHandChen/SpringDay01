package com.xyh.Transaction.Service;

import com.xyh.Transaction.Dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

import java.math.BigDecimal;

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    @Transactional(rollbackFor = Exception.class)
    public void transaction(String outer, String inner, BigDecimal money) {
            accountDao.out(outer, money);
//            int num = 1 / 0;
            accountDao.in(inner, money);
    }
}
