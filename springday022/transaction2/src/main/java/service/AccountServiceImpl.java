package service;

import dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

@Service("accountServiceImpl")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;
    @Autowired
    private TransactionTemplate transactionTemplate;
    @Override
    public void transfer(String outer, String inner, Double money) {
        transactionTemplate.execute(TransactionStatus -> {
            accountDao.out(outer,money);
            int num = 1/0;
            accountDao.in(inner,money);
           return null;
        });

    }
}
