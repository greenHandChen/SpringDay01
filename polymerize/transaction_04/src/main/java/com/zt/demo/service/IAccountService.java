package com.zt.demo.service;

import java.math.BigDecimal;

public interface IAccountService {

    void transfer(String outer, String inner, BigDecimal money);
}
