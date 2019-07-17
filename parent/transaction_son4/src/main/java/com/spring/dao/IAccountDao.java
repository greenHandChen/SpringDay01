package com.spring.dao;

/**
 * @Author:dragon_Dai
 * @Description:
 * @Date:Create in 16:18 2019/7/17
 * @Modified By:
 */
public interface IAccountDao {
    void in(String inner, Double money);
    void out(String outer, Double money);
}
