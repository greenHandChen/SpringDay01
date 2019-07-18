package transaction.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import transaction.dao.IAccountDao;

@Service
public class IAccountServiceImpl implements IAccountService{
    @Autowired
    private IAccountDao iAccountDao;
    @Transactional(rollbackFor = Exception.class)
    public void transfer(String outer,String inner,Double money){

            iAccountDao.out(outer,money);
//            int i = 1/0;
            iAccountDao.in(inner,money);
    }
}
