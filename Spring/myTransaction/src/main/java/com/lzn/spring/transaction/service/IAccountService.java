package com.lzn.spring.transaction.service;

public interface IAccountService {
    void transfer(String outer, String inner, Double money);
}
