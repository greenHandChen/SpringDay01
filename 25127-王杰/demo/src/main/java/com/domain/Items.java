package com.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by wangjie_fourth on 2019/7/20.
 */
@Data
public class Items {
    private Integer id;
    private String name;
    private float price;
    private String detail;
    private String pic;
    private Date createtime;

}
