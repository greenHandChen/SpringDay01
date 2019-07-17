package com.hand.service;

import org.springframework.beans.factory.annotation.Autowired;

public interface AccountService {

    public void transfer(String outer,String inner,Double money);
}
