package springDay02.demo2.service.impl;


import springDay02.demo2.dao.AccountDao;
import springDay02.demo2.service.IAccountService;

/**
 * Created by wangjie_fourth on 2019/7/17.
 */

public class AccountServiceImpl implements IAccountService {


    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    ;

    @Override
    public void transfer(final String outer, String inner, final Double money) {
        accountDao.out(outer, money);
        int number = 1 / 0;
        accountDao.in(inner, money);
    }
}
