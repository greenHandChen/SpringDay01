package com.yonye.spring.transcation.serverImpl;

import com.yonye.spring.transcation.dao.IAccountDao;
import com.yonye.spring.transcation.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public void transfer(String outer, String inner, Double money) {
        accountDao.out(outer,money);
        int number =1/0;
        accountDao.in(inner,money);
    }
}
