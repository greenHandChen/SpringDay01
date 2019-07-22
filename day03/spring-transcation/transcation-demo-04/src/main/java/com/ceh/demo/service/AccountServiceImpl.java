package com.ceh.demo.service;

import com.ceh.demo.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * Created by enHui.Chen on 2019/7/17.
 */
@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    @Transactional(rollbackFor = Exception.class)
    public void transfer(String outer, String inner, BigDecimal money) {
        accountDao.out(outer, money);
        int num = 1 / 0;
        accountDao.in(inner, money);
    }
}
