package com.hand.dao;

/**
 * Created by HuangHeng on 2019/7/17
 */
public interface AccountDao {
    /**
     * @author:  HuangHeng
     * @description  转入
     * @CreateDate:  2019/7/17
     */
    void in(String inner, int money);
    /**
     * @author:  HuangHeng
     * @description  转出
     * @CreateDate:  2019/7/17
     */
    void out(String outter, int money);
}
