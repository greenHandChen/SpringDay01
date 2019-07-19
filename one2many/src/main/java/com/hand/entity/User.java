package com.hand.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.util.List;

/**
 * Created by HuangHeng on 2019/7/18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;

    private String username;

    private String sex;

    @DateTimeFormat(pattern="yyyy-MM-dd")//页面写入数据库时格式化
    private Date birthday;

    private String address;

}
