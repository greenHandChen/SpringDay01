package service;

import dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountServiceImpl")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    @Override
    public void transfer(String outer, String inner, Double money) {
            accountDao.out(outer,money);
            int num = 1/0;
            accountDao.in(inner,money);


    }
}
