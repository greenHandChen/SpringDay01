package com.masirhh.service;

import java.math.BigDecimal;

public interface IAcountService {
    public void tansfer(String outer, String inner, BigDecimal money);
}
