package com.ljx.userserver.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author LinJianXiong
 * @Date 2019/7/26
 * @Time 10:22
 */
@Data
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "usernmae")
    private String username;

    private int addressId;

    private Date birthday;
}
