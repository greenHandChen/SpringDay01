package com.spring.service;

import com.spring.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 16:26 2019/7/17
 * @Modified By:
 */
@Service(value = "accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    @Qualifier(value = "accountDao")
    private IAccountDao accountDao;

    //编程式事务管理
    @Resource(name = "transactionTemplate")
    private TransactionTemplate transactionTemplate;

    public void transfer(String outer, String inner, Double money) {
        transactionTemplate.execute(TransactionStatus -> {
            accountDao.out(outer,money);
            int number = 1/0;
            accountDao.in(inner,money);
            return null;
        });
    }
}
