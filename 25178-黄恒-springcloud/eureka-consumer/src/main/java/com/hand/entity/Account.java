package com.hand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by HuangHeng on 2019/7/26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {
    //账户编号
    private Integer id;
    //用户名
    private String name;
    //账户余额
    private Double money;
}