package com.lzn.spring.transaction.dao;

public interface IAccountDao {
    void in(String inner, Double money);
    void out(String outer, Double money);
}
