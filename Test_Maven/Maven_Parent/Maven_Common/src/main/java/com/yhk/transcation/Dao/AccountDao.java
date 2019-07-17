package com.yhk.transcation.Dao;

public interface AccountDao {
    void in(String inner,double money);
    void out(String outer,double money);
}
