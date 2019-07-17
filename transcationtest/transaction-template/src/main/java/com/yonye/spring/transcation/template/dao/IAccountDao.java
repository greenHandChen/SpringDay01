package com.yonye.spring.transcation.template.dao;

public interface IAccountDao {

    void out(String outer, Double money);

    void in(String inner, Double money);
}
