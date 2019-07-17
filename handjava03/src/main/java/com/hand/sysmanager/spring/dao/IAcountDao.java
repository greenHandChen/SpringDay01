package com.hand.sysmanager.spring.dao;

import java.math.BigDecimal;

public interface IAcountDao {
   void  outMoney(String outer, BigDecimal money);
   void  inMoney(String inner,BigDecimal money);
}
