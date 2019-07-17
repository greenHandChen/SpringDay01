package Service;

import Dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    public void transfer(String outer, String inner, BigDecimal money) {
        transactionTemplate.execute(TransactionStatus -> {
            accountDao.out(outer,money);
            int a = 1 / 0;
            accountDao.in(inner,money);
            return null;
        });
    }
}
