package com.hand.handuserdetail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hand")
public class HandUserDetailApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandUserDetailApplication.class, args);
    }

}
