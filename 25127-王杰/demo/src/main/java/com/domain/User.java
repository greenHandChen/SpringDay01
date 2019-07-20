package com.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by wangjie_fourth on 2019/7/20.
 */
@Data
public class User {

    private Integer id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;

}
