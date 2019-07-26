package com.masirhh.countryprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.masirhh.countryprovider.mappers")
@SpringBootApplication
public class CountryProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CountryProviderApplication.class, args);
    }

}
