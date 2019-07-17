package com.zhang.service.impl;

import com.zhang.dao.IAccountDao;
import com.zhang.dao.impl.IAccountDaoImpl;
import com.zhang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ClassName:IAccountServiceImpl_1
 * Author:ZhangChunjia
 * Date:2019/7/17 21:32
 */
@Service("iAccountService_1")
public class IAccountServiceImpl_1 implements IAccountService {
    @Autowired
    @Qualifier("iAccountDao")
    private IAccountDao iAccountDao_1;
    //@Autowired

    public void setAccountDao(IAccountDao accountDao){
        this.iAccountDao_1=accountDao;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void transfer(String outer,String inner, Double money) {
        iAccountDao_1.out(outer,money);
        int n=1/0;
        iAccountDao_1.in(inner,money);
    }

}
