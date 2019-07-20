package com.yhk.transcation.ServiceImpl;

import com.yhk.transcation.Dao.AccountDao;
import com.yhk.transcation.Service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao){
        this.accountDao=accountDao;
    }

    //注入事务模板
//    @Autowired
//    private TransactionTemplate transactionTemplate;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void transfer(String outer, String inner, double money) {
//       transactionTemplate.execute(TransactionCallback->{
           accountDao.out(outer,money); //转出
//           int number=1/0;
           accountDao.in(inner,money);  //收入
//           return  null;
//       });
    }
}
