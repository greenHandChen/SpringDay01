package com.ceh.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by HuangHeng on 2019/7/16
 */
@Data
@AllArgsConstructor
public class Person {
    private String name;
    private Integer age;
    private String address;
}
