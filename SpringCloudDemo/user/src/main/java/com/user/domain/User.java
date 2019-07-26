package com.user.domain;


import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * Created by wangjie_fourth on 2019/7/26.
 */
@Alias("user")
@Data
public class User {

    private Integer id;

    private String userName;

    private Date birthday;

    private String sex;

    private String address;
}
