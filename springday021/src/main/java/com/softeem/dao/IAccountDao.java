package com.softeem.dao;

import org.springframework.context.annotation.Description;

@Description("转账案例的dao")
public interface IAccountDao{

    public  void outMoney(String out,int money);

    public void inMoney(String in,int money);

}
