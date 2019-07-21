package com.hand.service;

import com.hand.dao.AccountDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by HuangHeng on 2019/7/21
 */
public class AccountServiceImpl03 implements AccountService {

    private AccountDao accountDao;

    private TransactionTemplate transactionTemplate;

    public void setAccountDao(AccountDao accountDao){
        this.accountDao = accountDao;
    }
    public void setTransactionTemplate(TransactionTemplate transactionTemplate){
        this.transactionTemplate = transactionTemplate;
    }

    /**
     * @Author:  HuangHeng
     * @Description  out:转出账号，in：转入账号，money：转账金额
     *               int i = 1/0;  发生异常导致转出账号扣钱，转入账号未收钱
     *               未采用事务管理
     * @CreateDate:  2019/7/21
     */
//    public void transfer(String out, String in, Double money) {
//
//        accountDao.outmoney(out,money);
//        int i = 1/0;
//        accountDao.inMoney(in,money);
//    }

    /**
     * @Author:  HuangHeng
     * @Description  out:转出账号，in：转入账号，money：转账金额
     *               int i = 1/0;  发生异常导致转出账号扣钱，转入账号未收钱
     *               采用事务管理
     * @CreateDate:  2019/7/21
     */
    public void transfer(final String out, final String in, final Double money) {
        accountDao.outmoney(out,money);
        int i = 1/0;
        accountDao.inMoney(in,money);
    }
}
