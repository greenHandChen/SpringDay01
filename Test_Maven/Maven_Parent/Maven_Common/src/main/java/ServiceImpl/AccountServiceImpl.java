package ServiceImpl;

import Dao.AccountDao;
import Service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(String outer, String inner, double money) {
        accountDao.out(outer,money);
        accountDao.in(inner,money);
    }
}
