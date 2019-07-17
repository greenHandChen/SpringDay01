package com.ljx.service.impl;

import com.ljx.dao.IAccountDao;
import com.ljx.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;

/**
 * @author LinJianXiong
 * @Date 2019/7/17
 * @Time 18:06
 */
@Service
public class AccountServiceImpl implements IAccountService {

    @Resource(name = "iAccountDaoImpl")
    private IAccountDao iAccountDao;

    @Autowired
    private TransactionTemplate transactionTemplate;

    /**
     * 功能描述  转账   编程式实现方式
     *
     * @param *     @param outer
     * @param inner
     * @param money
     * @return void
     * @author LJX
     * @date 2019/7/17 19:07
     */
    @Override
    public void transfer(String outer, String inner, Double money) {
        transactionTemplate.execute(TransactionStatus -> {
            iAccountDao.out(outer, money);
            int a = 1 / 0;
            iAccountDao.in(inner, money);
            return null;
        });
    }

}
