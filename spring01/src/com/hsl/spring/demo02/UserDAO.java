package com.hsl.spring.demo02;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component(value="userDao")
public interface UserDAO {

     void find();

    ;

}
