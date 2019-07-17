package com.spring.service;

import com.spring.dao.IAccountDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 15:49 2019/7/17
 * @Modified By:
 */
@Service(value = "accountService")
public class AccountServcieImpl implements IAccountService {

    @Resource(name = "accountDao")
    private IAccountDao accountDao;
    /**
     * @param outer 转出人
     * @param inner 接受人
     * @param money 金额
     */
    public void transfer(String outer, String inner, Double money) {
        //转出人,先从账户扣掉钱
        accountDao.out(outer,money);

        //模拟出现异常,转账失败,转出人扣了钱,接收人并没有收到钱
        int number=1/0;

        //接收人,账户接收钱
        accountDao.in(inner,money);
    }
}
