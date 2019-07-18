package com.frank.transaction.dao;

public interface IAccountDao {
    /**
     * @Description: 转入
     * @param inner
     * @param money
     */
    public void in(String inner,Double money);

    /**
     * @Description: 转出
     * @param outer
     * @param money
     */
    public void out(String outer,Double money);
}
