package Service.impl;

import Dao.AccountDaoImpl;
import Dao.IAccountDao;
import Service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao iAccountDao;

//    @Autowired
//    private TransactionTemplate transactionTemplate;

//    public void transfer(String outer, String inner, Double money) {
////
////        transactionTemplate.execute(TransactionStatus->{
////            iAccountDao.out(outer,money);
////            int number=1/0;
////            iAccountDao.in(inner,money);
////            return null;
////         });}
    @Transactional(rollbackFor = Exception.class)
    public void transfer(String outer, String inner, Double money) {
        iAccountDao.out(outer,money);
        int number=1/0;
        iAccountDao.in(inner,money);
    }



}
