package com.yonye.spring.transcation.template.server;

public interface IAccountService {
    void transfer(String outer, String inner, Double money);
}
