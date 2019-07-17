package Transation.TransationService;

import Transation.TransationDAO.IAccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDAO accountDAO;

    //注入事务模块
    @Autowired
    private TransactionTemplate transactionTemplate;

    public void transfer(String outer, String inner, BigDecimal money){
        transactionTemplate.execute(TransactionStatus ->{  //匿名函数，回滚事务
            accountDAO.in(inner,money);
            int i = 1/0;
            accountDAO.out(outer,money);
            return null;
        });
    }
}
