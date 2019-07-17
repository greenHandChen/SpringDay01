package com.Service;

import com.Dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountServiceImpl")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Transactional(rollbackFor = Exception.class)
    public void transfer(String outer, String inner, Integer money) {
            accountDao.out(outer,money.intValue());
            int number=1/0;
            accountDao.in(inner,money.intValue());

    }
}
