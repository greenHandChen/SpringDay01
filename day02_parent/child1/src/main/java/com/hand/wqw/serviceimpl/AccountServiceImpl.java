package com.hand.wqw.serviceimpl;

import com.hand.wqw.dao.AccountDao;
import com.hand.wqw.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private TransactionTemplate transactionTemplate;


    /**
     * Spring编程式事务管理
     * @param outer
     * @param inner
     * @param money
     */
    public void transfer(String outer, String inner, Double money) {
        transactionTemplate.execute(transactionStatus -> {
                accountDao.out(outer, money);
                int i=1/0;
                accountDao.in(inner, money);
                return null;
        });

    }

    /**
     * Srping声明式事务管理原始方法
     * @param outer
     * @param inner
     * @param money
     */
    @Override
    public void transferProxy(String outer, String inner, Double money) {
        accountDao.out(outer, money);
        int i=1/0;
        accountDao.in(inner, money);
    }

    /**
     * Spring声明式事务管理AOP注解
     * @param outer
     * @param inner
     * @param money
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transferAOP(String outer, String inner, Double money) {
        accountDao.out(outer, money);
        int i=1/0;
        accountDao.in(inner, money);
    }
}
