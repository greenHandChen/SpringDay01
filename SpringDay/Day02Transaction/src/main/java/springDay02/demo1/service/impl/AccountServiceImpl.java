package springDay02.demo1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import springDay02.demo1.dao.IAccountDao;
import springDay02.demo1.service.IAccountService;

/**
 * Created by wangjie_fourth on 2019/7/17.
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    // 注入事务模板
    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    public void transfer(final String outer, String inner, final Double money) {
//        accountDao.out(outer, money);
//        int num = 1/0;
//        accountDao.in(inner, money);

        Object result = transactionTemplate.execute(TransactionStatus -> {
            accountDao.out(outer, money);
            int num = 1 / 0;
            accountDao.in(inner, money);
            return null;
        });


    }
}
