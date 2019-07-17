package hand.service;

import hand.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import hand.dao.IAccountDao;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao iAccountDao;
    @Autowired
    private TransactionTemplate transactionTemplate;

    public void transfer(String outer,String inner,Double money){
         iAccountDao.out(outer,money);
           int number = 1/0;
           iAccountDao.in(inner,money);
    }

//    public void transfer(String outer,String inner,Double money){
//       transactionTemplate.execute(TransactionTemplate ->{
//           iAccountDao.out(outer,money);
//           int number = 1/0;
//           iAccountDao.in(inner,money);
//       });
//    }
}
