package com.wpb.dao;

public interface IAccountDao {
    /**
     * 转进
     * @param username
     * @param amount
     * @return
     */
    public int inAccount(String username, double amount);

    /**
     * 转出
     * @param username
     * @param amount
     * @return
     */
    public int outAccount(String username, double amount);
}
