package com.hand.wqw.service;

public interface IAccountService {
    void transfer(String outer ,String inner,Double money);
    void transferProxy(String outer ,String inner,Double money);
    void transferAOP(String outer ,String inner,Double money);
}
