package com.hand.dao;

public interface AccountDao {
    void out(String outer, Double money);
    void in(String inner, Double money);
}
