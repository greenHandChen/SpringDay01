package com.transaction.Service;

import com.transaction.Dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class IAccountServiceImpl implements IAccountService{
    //@Autowired
    private IAccountDao iAccountDao;
    //@Autowired
    private TransactionTemplate transactionTemplate;

    public IAccountDao getiAccountDao() {
        return iAccountDao;
    }

    public void setiAccountDao(IAccountDao iAccountDao) {
        this.iAccountDao = iAccountDao;
    }

    /**
     *
     * @param outer 转出者
     * @param inner 转入者
     * @param money 金额
     */

    public void transfer(String outer,String inner,Double money){
        transactionTemplate.execute(transactionStatus -> {
            iAccountDao.out(outer,money);
            //故意抛出一个异常
            int number=1/0;
            iAccountDao.in(inner,money);
            return null;
        });
    }
    /*@Transactional(rollbackFor = Exception.class)
    public void transfer(String outer,String inner,Double money){
        iAccountDao.out(outer,money);
        //故意抛出一个异常
        int number=1/0;
        iAccountDao.in(inner,money);
    }*/
}
