package com.hand.service;

/**
 * Created by HuangHeng on 2019/7/21
 */
public interface AccountService {
    
    /**
     * @Author:  HuangHeng
     * @Description  out:转出账号，in：转入账号，money：转账金额
     * @CreateDate:  2019/7/21
     */
    public void transfer(String out,String in,Double money);

}
