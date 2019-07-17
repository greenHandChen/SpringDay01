package huanglehao.study.service;

import huanglehao.study.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    public IAccountDao accountDao;

    @Override
    @Transactional(propagation= Propagation.REQUIRED,
            isolation= Isolation.DEFAULT,
            readOnly=false,
            noRollbackFor = Exception.class)
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
