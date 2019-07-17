package huanglehao.study.service;

import huanglehao.study.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    //注入事务模板
    @Autowired
    private TransactionTemplate transactionTemplate;

    @Autowired
    private IAccountDao accountDao;

    @Override
    public void transfer(String outer, String inner, int money) {
        transactionTemplate.execute(TransactionStatus ->{
            accountDao.in(outer,money);
            int number=10/0;
            accountDao.out(inner,money);
            System.out.println("执行完毕");
            return null;
        });


    }
}
