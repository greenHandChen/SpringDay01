package springDay02.demo3.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springDay02.demo3.dao.AccountDao;
import springDay02.demo3.service.IAccountService;

/**
 * Created by wangjie_fourth on 2019/7/17.
 */
@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transfer(final String outer, String inner, final Double money) {
        accountDao.out(outer, money);
        int number = 1 / 0;
        accountDao.in(inner, money);
    }
}
