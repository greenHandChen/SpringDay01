package com.hand.lq.dao;

public interface AccountDao {
    public void out(String outer,Double money);
    public void in(String inner,Double money);
}
