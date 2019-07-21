package com.hand.dao;

/**
 * Created by HuangHeng on 2019/7/21
 */
public interface AccountDao {

    /**
     * @Author:  HuangHeng
     * @Description  out:转出账号，money：转账金额
     * @CreateDate:  2019/7/21
     */
    void outmoney(String out,Double money);
    /**
     * @Author:  HuangHeng
     * @Description  in：转入账号，money：转账金额
     * @CreateDate:  2019/7/21
     */
    void inMoney(String in,Double money);
}
