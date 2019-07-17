package com.xyh.Transaction.Service;

import java.math.BigDecimal;

public interface AccountServiceInter {

    void transaction(String outer, String inner, BigDecimal money);
}
