package Service;

import Dao.AccountDaoImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountDaoImpl accountDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    public void transfer(String outer, String inner, BigDecimal money) {
//        非事务的方法 当出现问题时不能回滚
//        accountDao.out(outer,money);
//        int number = 1/0;
//        accountDao.in(inner,money);

        //事务编程式管理
//        transactionTemplate.execute( TransactionStatus -> {
//                accountDao.out(outer,money);
//                int number = 1/0;
//                accountDao.in(inner,money);
//                return null;
//        });

        //配置文件半自动式接口代理
        accountDao.out(outer,money);
        int number = 1/0;
        accountDao.in(inner,money);
    }
    //用
    @Transactional(rollbackFor = Exception.class)
    public void transferBycglib(String outer, String inner, BigDecimal money){
        accountDao.out(outer,money);
        int number = 1/0;
        accountDao.in(inner,money);
    }
}
