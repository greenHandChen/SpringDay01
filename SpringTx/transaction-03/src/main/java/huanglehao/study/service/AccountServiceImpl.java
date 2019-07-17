package huanglehao.study.service;

import huanglehao.study.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements IAccountService {

    public IAccountDao accountDao;

    @Override
    public void transfer(String outer, String inner, int money) {
       accountDao.out(outer,money);
       int number=1/0;
       accountDao.in(inner,money);

    }

    public IAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
