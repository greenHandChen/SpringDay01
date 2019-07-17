package com.yonye.spring.transcation.dao;

public interface IAccountDao {

    void out(String outer,Double money);

    void in(String inner,Double money);
}
