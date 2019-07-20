package club.osai.service;

import club.osai.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: AccountServiceImpl.java
 * @Version: 1.0
 * @Date: 2019/7/17
 * @Description:
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public TransactionTemplate getTransactionTemplate() {
        return transactionTemplate;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    public void transfer(String outer, String inner, Double money) {
        transactionTemplate.execute(it -> {
            accountDao.in(inner, money);
//            int i = 1 / 0;
            accountDao.out(outer, money);
            return null;
        });

    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void transfer2(String outer, String inner, Double money) {
        accountDao.in(inner, money);
        int i = 1 / 0;
        accountDao.out(outer, money);

    }
}
