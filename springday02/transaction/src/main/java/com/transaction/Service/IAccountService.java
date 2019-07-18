package com.transaction.Service;

import org.springframework.stereotype.Service;


public interface IAccountService {
    public void transfer(String outer,String inner,Double money);
}
