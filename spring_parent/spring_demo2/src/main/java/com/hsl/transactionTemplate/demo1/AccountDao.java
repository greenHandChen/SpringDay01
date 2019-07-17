package com.hsl.transactionTemplate.demo1;

public interface AccountDao  {

    void InMoney(String Toname ,double money);
    void OutMoney(String Toname ,double money);
}
