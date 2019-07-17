package Service;

import Dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transfer(String outer, String inner, BigDecimal money) {
            accountDao.out(outer,money);
//            int a = 1 / 0;
            accountDao.in(inner,money);
    }
}
