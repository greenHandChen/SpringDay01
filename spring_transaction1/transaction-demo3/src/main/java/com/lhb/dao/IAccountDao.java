package com.lhb.dao;

/**
 * Created By LHB on 2019/7/17;
 */
public interface IAccountDao {

    public void out(String outer, Double money);
    public void in(String inner, Double money);

}
