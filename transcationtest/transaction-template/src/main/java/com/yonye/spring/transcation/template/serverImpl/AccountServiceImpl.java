package com.yonye.spring.transcation.template.serverImpl;


import com.yonye.spring.transcation.template.dao.IAccountDao;
import com.yonye.spring.transcation.template.server.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;
    //注入事务模板
    @Autowired
    private TransactionTemplate transactionTemplate;

    @Override
    public void transfer(String outer, String inner, Double money) {
        transactionTemplate.execute(TransactionStatus->{
            accountDao.out(outer,money);
            int number =1/0;
            accountDao.in(inner,money);
            return null;
        });

    }


}
