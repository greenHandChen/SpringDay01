package com.hand.service;

import com.hand.dao.AcountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AcountServiceImpl implements AcountService {

    @Autowired
    private AcountDao acountDao;

    /**
     *
     * 转账：谁给谁转多少钱
     */
    @Transactional(rollbackFor = Exception.class)
    public void transfer(String outer, String inner, double money) {
            acountDao.out(outer,money);
            int number=1/0;
            acountDao.in(inner,money);
    }

}
