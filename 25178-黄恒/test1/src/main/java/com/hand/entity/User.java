package com.hand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.util.List;

/**
 * Created by HuangHeng on 2019/7/20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;

    private String username;

    private String sex;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    private String address;

    //订单信息
    private List<Orders> orders;

}
