package com.hand.service;

/**
 * Created by HuangHeng on 2019/7/17
 */
public interface IAccountService {
    /**
     * @author:  HuangHeng
     * @description  转账
     * @CreateDate:  2019/7/17
     */
    void transfer(String outer, String inner, int money);
}
