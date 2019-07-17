package com.hand.trans;

public interface IAccountDao {
    void out(String outer, Double money);
     void in(String inner, Double money);
}
