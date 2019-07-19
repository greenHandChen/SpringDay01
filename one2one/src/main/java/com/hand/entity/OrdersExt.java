package com.hand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by HuangHeng on 2019/7/19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdersExt extends Orders {

    private String username;// 用户姓名

    private String sex;// 性别

    private User user;

}
