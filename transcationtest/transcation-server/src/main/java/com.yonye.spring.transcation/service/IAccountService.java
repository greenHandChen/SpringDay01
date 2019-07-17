package com.yonye.spring.transcation.service;

public interface IAccountService {
    void transfer(String outer,String inner,Double money);
}
