package com.spring.trancation.Dao;

public interface IAccountDao{
      public void out(String outer,Double money);
      public void in(String inter,Double money);
}
