package com.dragon.springcloud.entities;

import lombok.Getter;
import lombok.Setter;

/**
 * @package com.ll.springcloud.entities
 * @Author LL
 * @ClassName User
 * @Date 2019/7/26  15:24
 */

@Setter
@Getter
public class User {
    private Integer userId;
    private String userName;
    private String dbsource;

    public User() {
    }

    public User(Integer userId, String userName, String dbsource) {
        this.userId = userId;
        this.userName = userName;
        this.dbsource = dbsource;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", dbsource='" + dbsource + '\'' +
                '}';
    }
}
