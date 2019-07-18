package transaction.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;
import transaction.dao.IAccountDao;

@Service
public class IAccountServiceImpl implements IAccountService{
    @Autowired
    private IAccountDao iAccountDao;
    @Autowired
    private TransactionTemplate transactionTemplate;
    public void transfer(String outer,String inner,Double money){
        transactionTemplate.execute(TransactionStatus->{

            iAccountDao.out(outer,money);
            int i = 1/0;
            iAccountDao.in(inner,money);
            return null;
        });
    }
}
