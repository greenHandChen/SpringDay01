package com.sise.transaction;

public interface AccountDao {

    public void in(String inner,Double money);

    public void out(String outer,Double money);
}
