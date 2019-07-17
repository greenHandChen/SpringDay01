package com.ljx.service.impl;

import com.ljx.dao.IAccountDao;
import com.ljx.service.IAccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author LinJianXiong
 * @Date 2019/7/17
 * @Time 23:15
 */
@Service
public class AccountServiceImpl02 implements IAccountService {

    @Resource(name = "iAccountDaoImpl")
    private IAccountDao iAccountDao;

    /**
     *功能描述   AOP配置事务基于注解
     * @author LJX
     * @date 2019/7/17 22:31
     * @param  * @param outer
     * @param inner
     * @param money
     * @return void
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void transfer(String outer, String inner, Double money) {
        iAccountDao.out(outer, money);
        //int a = 1 / 0;
        iAccountDao.in(inner, money);
    }
}
