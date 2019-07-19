package com.jqh.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: 几米
 * @Date: 2019/7/19 09:11
 * @Description: Orders
 */
@Data
public class Orders {
    private Integer id;
    private Integer userId;
    private String number;
    private Date createtime;
    private String note;
}
