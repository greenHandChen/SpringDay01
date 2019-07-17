package com.hand.service;

import java.math.BigDecimal;

public interface AccountService {

    void transfer(String inAcc, String outAcc, BigDecimal money);
}
