package com.jqh.service;

import com.jqh.dao.AccountDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @Auther: 几米
 * @Date: 2019/7/17 10:37
 * @Description: AccountService
 */
@Service
@EnableTransactionManagement
public class AccountService {
    @Resource
    AccountDao accountDao;
//public void transfer(String outer ,String inner,Double money){
//    accountDao.in(inner,money);
//    accountDao.out(outer,money);
//}

//   public void transfer(String outer ,String inner,Double money){
//        accountDao.in(inner,money);
//        int num=1/0;
//        accountDao.out(outer,money);
//    }

@Transactional(

)
    public void transfer(String outer ,String inner,Double money){
        accountDao.in(inner,money);
        int num=1/0;
        accountDao.out(outer,money);
    }

}
