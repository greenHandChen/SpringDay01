package com.ll.demo.dao;

import java.math.BigDecimal;

public interface IAccountDao {

    void in(String inner, int money);

    void out(String outter, int money);

}
