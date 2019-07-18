package com.transaction.Dao;

public interface IAccountDao {
    public void in(String inner,Double money);
    public void out(String inner,Double money);
}
