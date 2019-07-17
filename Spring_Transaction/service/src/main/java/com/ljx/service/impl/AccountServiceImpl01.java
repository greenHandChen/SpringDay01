package com.ljx.service.impl;

import com.ljx.dao.IAccountDao;
import com.ljx.service.IAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LinJianXiong
 * @Date 2019/7/17
 * @Time 23:13
 *
 * 测试该类,调用Test02，记得要注释AccountServiceImpl的@Service
 */
public class AccountServiceImpl01 implements IAccountService {

    @Resource(name = "iAccountDaoImpl")
    private IAccountDao iAccountDao;

    /**
     * 功能描述   半自动式(不需要配置任何有关于事务的内容)
     *
     * @param *     @param outer
     * @param inner
     * @param money
     * @return void
     * @author LJX
     * @date 2019/7/17 22:29
     */
    @Override
    public void transfer(String outer, String inner, Double money) {
        iAccountDao.out(outer, money);
        //int a = 1 / 0;
        iAccountDao.in(inner, money);
    }
}
