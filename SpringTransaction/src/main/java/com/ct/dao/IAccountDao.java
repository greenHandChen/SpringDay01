package com.ct.dao;

/**
 * @author 程添
 */
public interface IAccountDao {
    /**
     * 转账转出
     * @param outer 用户名
     * @param money 转出的钱
     */
    void out(String outer,Double money);

    /**
     * 转账转入
     * @param inner 用户名
     * @param money 转入的钱
     */
    void in(String inner ,Double money);
}
