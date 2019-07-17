package com.hand.service;

import com.hand.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao iaccountdao;
    @Autowired
    private TransactionTemplate transactionTemplate;

    /**
     * 编程式事务
     * @param outer
     * @param inner
     * @param money
     */
    public void transfer(String outer, String inner, Double money) {
        //transactionTemplate.execute(transactionStatus -> {
            iaccountdao.out(outer, money);
            int number=1 / 0;
            iaccountdao.in(inner, money);
            //return null;

        //});

    }

    /**
     * 代理式事务
     * @param outer
     * @param inner
     * @param money
     */
    @Transactional(rollbackFor = Exception.class)
    public void transferAOP(String outer, String inner, Double money) {
        iaccountdao.out(outer, money);
        int number = 1 / 0;
        iaccountdao.in(inner, money);

    }
        public void  setIaccountdao(IAccountDao iaccountdao){
        this.iaccountdao=iaccountdao;
    }
}
