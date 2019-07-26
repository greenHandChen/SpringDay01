package com.ljx.userserver.form;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

/**
 * @author LinJianXiong
 * @Date 2019/7/26
 * @Time 11:29
 */
@Data
public class UserForm {
    private Integer id;

    private String username;

    private int addressId;

    private Date birthday;
}
