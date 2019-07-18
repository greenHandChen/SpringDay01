package com.wpb.service;

public interface IAccountService {
    /**
     * 转账方法
     *
     * @param outAccount
     * @param inAccount
     * @param amount
     * @return
     */
    public int transfer(String outAccount, String inAccount, Double amount);

    public int transfer2(String mybatis, String hibernate, Double v);

    public int transfer3(String mybatis, String hibernate, Double v);

    public int transfer4(String outAccount, String inAccount, Double amount);
}
