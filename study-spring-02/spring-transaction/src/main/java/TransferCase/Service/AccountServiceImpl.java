package TransferCase.Service;

import TransferCase.Dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    // 注入事务板
    @Autowired
    private TransactionTemplate transactionTemplate;

    public void transfer(String outer, String inner, Double money) {

        transactionTemplate.execute(TransactionStatus -> {

            accountDao.out(outer, money);

            int number = 1 / 0; // 断点

            accountDao.out(inner, money);

            return null;

        });

//            accountDao.out(outer, money);
//
//            accountDao.out(inner, money);
    }
}
