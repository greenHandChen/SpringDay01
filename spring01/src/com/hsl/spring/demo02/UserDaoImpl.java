package com.hsl.spring.demo02;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository(value="userDao")
public class UserDaoImpl implements  UserDAO {

    @Value("hsl")
    private String name;

    @Override
    public void find() {
        System.out.println("找到用户A"+name);
    }



}
