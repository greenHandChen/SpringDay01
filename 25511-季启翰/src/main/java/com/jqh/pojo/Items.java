package com.jqh.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: 几米
 * @Date: 2019/7/19 09:13
 * @Description: Items
 */
@Data
public class Items {
    private Integer id;
    private String name;
    private Float price;
    private String detail;
    private String pic;
    private Date createtime;
}
