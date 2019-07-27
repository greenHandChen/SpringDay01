package com.cloud.user.entity;

import lombok.Data;

@Data
public class User{
    private Integer id;

    private String name;

    private String password;

    private Integer commentId;
}
