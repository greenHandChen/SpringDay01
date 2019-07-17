package com.lx.springtest.Service.Impl;

import com.lx.springtest.Dao.IAccountDao;
import com.lx.springtest.Service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    /**
     * propagation=Propagation.REQUIRED 传播行为
     * isolation=Isolation.DEFAULT 隔离级别
     * readOnly=false 是否只读
     * rollbackFor=ArithmeticException.class 发生异常回滚
     * noRollbackFor=xxx.class 发生异常 仍然提交事务
     */
    @Transactional(rollbackFor = Exception.class)
    public void transfer(String outer, String inner, Double money) {
        accountDao.out(outer,money);
//        int number = 1/0;
        accountDao.in(inner,money);
    }
}
