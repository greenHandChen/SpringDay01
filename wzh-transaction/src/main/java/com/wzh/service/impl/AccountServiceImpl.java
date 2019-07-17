package com.wzh.service.impl;

import com.wzh.dao.IAccountDao;
import com.wzh.service.IAcccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class AccountServiceImpl implements IAcccountService {

    @Transactional(rollbackFor = Exception.class
    )
    public void transfer(String outer, String inner, Double money) {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        IAccountDao accountDao = (IAccountDao) applicationContext.getBean("accountDao");
        accountDao.out(outer, money);
        int num = 1 / 0;
        accountDao.in(inner, money);
    }


}
