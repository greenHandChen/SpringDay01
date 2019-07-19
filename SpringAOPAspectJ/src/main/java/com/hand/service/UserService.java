package com.hand.service;

import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Override
    public void service01(){
        System.out.println("service 01 is running...");
    }

    @Override
    public int service02(){
        System.out.println("service 02 is running...");
        return 8;
    }

    @Override
    public String service03() {
        System.out.println("service 03 is running...");
        return "today id a good day...";
    }
}
