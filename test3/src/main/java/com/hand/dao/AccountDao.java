package com.hand.dao;

/**
 * Created by HuangHeng on 2019/7/17
 */
public interface AccountDao {
    void in(String inner, int money);

    void out(String outter, int money);
}
