package com.transaction.dao;

public interface IAccountDao {

    void out(String outer,Double money);

    void in(String inner,Double money);
}
