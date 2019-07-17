package com.ljx.dao;


/**
 * @author LinJianXiong
 * @Date 2019/7/17
 * @Time 18:02
 */
public interface IAccountDao {
    void out(String outer,Double money);
    void in(String inner ,Double money);
//
//    void out(Account account);
//    void in(Account account);

}
