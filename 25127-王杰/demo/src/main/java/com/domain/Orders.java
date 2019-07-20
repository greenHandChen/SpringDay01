package com.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by wangjie_fourth on 2019/7/20.
 */
@Data
public class Orders {
    private Integer id;
    private Integer userId;
    private String number;
    private Date createtime;
    private String note;
}
