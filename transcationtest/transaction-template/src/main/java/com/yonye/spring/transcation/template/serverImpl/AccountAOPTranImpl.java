package com.yonye.spring.transcation.template.serverImpl;

import com.yonye.spring.transcation.template.dao.IAccountDao;
import com.yonye.spring.transcation.template.server.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountAOPTranImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;


    @Override
    @Transactional(rollbackFor=Exception.class)
    public void transfer(String outer, String inner, Double money) {
        accountDao.out(outer,money);
       // int number =1/0;
        accountDao.in(inner,money);

    }
}
