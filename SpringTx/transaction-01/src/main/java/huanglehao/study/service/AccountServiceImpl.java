package huanglehao.study.service;

import huanglehao.study.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public void transfer(String outer, String inner, int money) {
        accountDao.in(outer,money);
        int number=10/0;
        accountDao.out(inner,money);
    }
}
