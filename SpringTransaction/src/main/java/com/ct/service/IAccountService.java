package com.ct.service;

public interface IAccountService {
    /**
     * 测试基于注解的声明式事务管理
     * @param outer 转出的用户
     * @param inner 转入的用户
     * @param money 转入转出额度
     */
    void transfer(String outer ,String inner,Double money);
    /**
     * 测试编程式事务管理
     * @param outer 转出的用户
     * @param inner 转入的用户
     * @param money 转入转出额度
     */
    void transfer1(String outer ,String inner,Double money);
    /**
     * 测试基于xml配置文件的声明式事务管理
     * @param outer 转出的用户
     * @param inner 转入的用户
     * @param money 转入转出额度
     */
    void transfer2(String outer ,String inner,Double money);
}
