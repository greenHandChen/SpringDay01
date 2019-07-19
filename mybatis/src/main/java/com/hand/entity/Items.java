package com.hand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by HuangHeng on 2019/7/19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Items {

    private Integer id;

    private String name;

    private Float price;

    private String pic;

    private Date createtime;

    private String detail;
}
